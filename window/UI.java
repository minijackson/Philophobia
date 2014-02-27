package window;

import main.Philophobia;
import world.World;
import world.Scenery;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.io.File;
import java.io.IOException;
import java.awt.Image;
import javax.imageio.ImageIO;

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
	 * Height of the UI's top bar (default: 42px)
	 */
	protected static int TOPBAR_HEIGHT = 42;

	/**
	 * Margin of the top bar (default: 10px)
	 */
	protected static int TOPBAR_MARGIN = 10;

	/**
	 * UI class constructor
	 * @param windowHeight Height of the window
	 * @param windowWidth Width of the window
	 */
	public UI(int windowHeight, int windowWidth) {
		// We call the parent's constructor
		super();

		Philophobia.getVerbose().calls("Creating UI class", "org/window/UI.java", "UI.UI(int, int)");

		this.windowHeight = windowHeight;
		this.windowWidth = windowWidth;

		state = UIState.LoadingScreen;
//		displayedWorld = new World("test", windowHeight - TOPBAR_HEIGHT, windowWidth);
	}

	/**
	 * Function called when the program ask to paint the graphics
	 */
	public void paintComponent(Graphics g) {
		Philophobia.getVerbose().calls("painting components", "org/window/UI.java", "UI.paintComponent(Graphics)");
		
		// Top Bar
		g.fillRect(0,0, windowWidth, TOPBAR_HEIGHT);

		// Close Button
		try {
			Image closeImage = ImageIO.read(new File("images/closebutton.png"));
			g.drawImage(closeImage, windowWidth - TOPBAR_HEIGHT, (int)(TOPBAR_MARGIN / 2), TOPBAR_HEIGHT - TOPBAR_MARGIN, TOPBAR_HEIGHT - TOPBAR_MARGIN, null);
		} catch(IOException e) {
			Philophobia.getVerbose().warning("Close button image load failed: " + e.getMessage(), "window/UI.java", "UI.paintComponent(Graphics)");
		}

		// Pause button
		try {

			Image pauseImage = ImageIO.read(new File("images/pausebutton.png"));
			g.drawImage(pauseImage, windowWidth - (TOPBAR_HEIGHT *2 + TOPBAR_MARGIN), (int)(TOPBAR_MARGIN / 2), TOPBAR_HEIGHT - TOPBAR_MARGIN, TOPBAR_HEIGHT - TOPBAR_MARGIN, null);

		} catch(IOException e) {
			Philophobia.getVerbose().warning("Pause button image load failed: " + e.getMessage(), "window/UI.java", "UI.paintComponent(Graphics)");
		}

		//drawWorld(g);
	}

	/**
	 * Function called to draw the world
	 * <p>
	 * This function just display each Scenery one by one
	 * @see #displayedWorld
	 */
	private void drawWorld(Graphics g) {
		
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