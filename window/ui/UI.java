package window.ui;

import main.Philophobia;
import world.World;
import world.Scenery;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Class used to handle the window's user interface
 * 
 * This class can be in different states
 * @see UIState
 */
public class UI extends JPanel {

	/**
	 * World displayed inside the window
	 */
	protected World displayedWorld;

	/**
	 * Current state of the Graphics displayed
	 * @see UIState
	 */
	UIState state;

	/**
	 * Window height
	 */
	protected int windowHeight;

	/**
	 * Window width
	 */
	protected int windowWidth;

	/**
	 * UI class constructor
	 * @param windowHeight Height of the window
	 * @param windowWidth Width of the window
	 */
	public UI(int windowHeight, int windowWidth) {
		// We call the parent's constructor
		super();

		Philophobia.getVerbose().calls("Creating UI class", "window/ui/UI.java", "UI.UI(int, int)");

		this.windowHeight = windowHeight;
		this.windowWidth = windowWidth;

		state = UIState.LoadingScreen;
//		displayedWorld = new World("test", windowHeight - TOPBAR_HEIGHT, windowWidth);
	}

	/**
	 * Function called when the program ask to paint the graphics
	 */
	public void paintComponent(Graphics g) {
		Philophobia.getVerbose().calls("painting components", "window/ui/UI.java", "UI.paintComponent(Graphics)");
		
		//drawWorld(g);
	}

	/**
	 * Function called to draw the world
	 * <p>
	 * This function just display each Scenery one by one
	 * @see #displayedWorld
	 */
	private void drawWorld(Graphics g) {
	
		Philophobia.getVerbose().calls("Painting the world", "window/ui/UI.java", "UI.drawWorld(Graphics)");

		Scenery[][] worldMap = displayedWorld.getMap();
		int worldMapXSize = displayedWorld.getSizeX();
		int worldMapYSize = displayedWorld.getSizeY();

		for(int i = 0 ; i < worldMapXSize ; ++i) {
			for(int j = 0 ; j < worldMapYSize ; ++j) {
				worldMap[i][j].drawScenery(g, i*Scenery.getSceneryHeight(), j*Scenery.getSceneryWidth(), this);
			}
		}

	}

};

/**
 * Enumeration of the possible states of the displayed graphics
 * <p>
 * The state can be the "in game" state, a loading screen,
 * the "win" or "fail" screen
 * @see UI
 * @see #Game
 * @see #LoadingScreen
 * @see #Win
 * @see #Fail
 */
enum UIState {
	
	/**
	 * The Game state correspond to the state
	 * in which the player is playing the game
	 */
	Game,

	/**
	 * The LoadingScreen state correspond to
	 * the state where a loading animation
	 * is displayed
	 */
	LoadingScreen,

	/**
	 * The Win state correspond to the state
	 * where the player has won the game and
	 * a congratulation screen is displayed
	 */
	Win,

	/**
	 * The Fail state correspond to the state
	 * where the player has lost the game
	 * and a condolence screen is displayed
	 */
	Fail

};
