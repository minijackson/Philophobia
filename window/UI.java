package window;

import main.Philophobia;
import world.World;
import world.Scenery;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Class used to handle the window's user interface
 * <p>
 * The UI is composed most of the time of two parts :
 * the top bar and the gameplay part (which basically
 * contain the world)
 * <p>
 * The UI can be also in "Loading mode" which consist
 * of a loading animation screen
 */
public class UI extends JPanel {

	/**
	 * World displayed inside the window
	 */
	protected World displayedWorld;

	/**
	 * Window height
	 */
	protected int windowHeight;

	/**
	 * Window width
	 */
	protected int windowWidth;

	/**
	 * Height of the UI's topbar (default : 42)
	 */
	protected static int TOPBAR_HEIGHT = 42;

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

		displayedWorld = new World("test", windowHeight - TOPBAR_HEIGHT, windowWidth);
	}

	/**
	 * Function called when the program ask to paint the graphics
	 */
	public void paintComponent(Graphics g) {
		Philophobia.getVerbose().calls("painting components", "org/window/UI.java", "UI.paintComponent(Graphics)");
		
		// Top Bar
		g.fillRect(0,0, windowWidth, TOPBAR_HEIGHT);

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
