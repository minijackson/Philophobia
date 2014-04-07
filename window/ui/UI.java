/**
 * \package window.ui
 * Package handling the user interface (UI) inside the Window.
 */
package window.ui;

import main.Philophobia;
import world.World;
import world.scenery.Scenery;
import world.scenery.Tree;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Class used to handle the window's user interface
 * 
 * This class can be in different states
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

	}

	/**
	 * UI class constructor
	 * @param windowHeight Height of the window
	 * @param windowWidth Width of the window
	 * @param world World to display
	 */
	public UI(int windowHeight, int windowWidth, World world) {
		super();

		Philophobia.getVerbose().calls("Creating UI class", "window/ui/UI.java", "UI.UI(int, int,World)");

		this.windowHeight = windowHeight;
		this.windowWidth = windowWidth;
		this.displayedWorld = world;
	}
	
	/**
	 * Setter for the displayedWorld field
	 * @see #displayedWorld
	 * @param world World to display
	 */
	public void setDisplayedWorld(World world) {
		this.displayedWorld = world;
	}

	/**
	 * Function called when the program ask to paint the graphics
	 * @param g Graphics to use
	 */
	public void paintComponent(Graphics g) {
		Philophobia.getVerbose().calls("Painting UI components", "window/ui/UI.java", "UI.paintComponent(Graphics)");
		super.paintComponent(g);
		drawWorld(g);
	}

	/**
	 * Function called to draw the world
	 * <p>
	 * This function just display each Scenery one by one
	 * but trees are displayed after everything else as
	 * they must be on top of everything because of their
	 * size
	 * @see #displayedWorld
	 * @param g Graphics to use
	 */
	private void drawWorld(Graphics g) {
	
		Philophobia.getVerbose().calls("Painting the world", "window/ui/UI.java", "UI.drawWorld(Graphics)");

		Scenery[][] worldMap = displayedWorld.getMap();
		int worldMapXSize = displayedWorld.getSizeX();
		int worldMapYSize = displayedWorld.getSizeY();

		for(int i = 0 ; i < worldMapXSize ; ++i) {
			for(int j = 0 ; j < worldMapYSize ; ++j) {
				if(!worldMap[i][j].getClass().getName().equals("Tree"))
					worldMap[i][j].drawScenery(g, i*Scenery.getSceneryHeight(), j*Scenery.getSceneryWidth(), this);
			}
		}

		for(int i = 0 ; i < worldMapXSize ; ++i) {
			for(int j = 0 ; j < worldMapYSize ; ++j) {
				if(worldMap[i][j].getClass().getName().equals("Tree"))
					worldMap[i][j].drawScenery(g, i*Scenery.getSceneryHeight(), j*Scenery.getSceneryWidth(), this);
			}
		}

	}

};
