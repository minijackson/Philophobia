package window.ui;

import main.Philophobia;
import world.World;
import world.scenery.Scenery;

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
	 * Setter for the displayedWorld field
	 * @see #displayedWorld
	 */
	public void setDisplayedWorld(World world) {
		this.displayedWorld = world;
	}

	/**
	 * Function called when the program ask to paint the graphics
	 */
	public void paintComponent(Graphics g) {
		Philophobia.getVerbose().calls("Painting UI components", "window/ui/UI.java", "UI.paintComponent(Graphics)");
		super.paintComponent(g);
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
