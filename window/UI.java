package window;

import main.Philophobia;
import world.World;

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

	public UI(int windowHeight, int windowWidth) {
		// We call the parent's constructor
		super();

		Philophobia.getVerbose().calls("Creating UI class", "org/window/UI.java", "UI.UI(int, int)");

		this.windowHeight = windowHeight;
		this.windowWidth = windowWidth;

	}

	/**
	 * Function called when the program ask to paint the graphics
	 */
	public void paintComponent(Graphics g) {
		Philophobia.getVerbose().calls("painting components", "org/window/UI.java", "UI.paintComponent(Graphics)");
		
		g.drawRect(0,0,10, windowWidth);

		displayedWorld = new World("test", g, windowHeight - 10, windowWidth);
	}

};
