/**
 * \package world.scenery
 * Package handling the tiles (Scenery) in the game's World.
 */
package world.scenery;

import main.Philophobia;

import java.awt.Graphics;
import java.io.File;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.util.Observer;
import java.awt.image.ImageObserver;
import java.io.IOException;

/**
 * Class used to handle any world object
 * <p>
 * The Scenery class is used to handle the objects
 * that are displayed in the graphical game world.
 */
abstract public class Scenery {
	
	/**
	 * Height of the graphical representation of a Scenery object
	 */
	protected static int SCENERY_HEIGHT = 85;
	
	/**
	 * Width of the graphical representation of a Scenery object
	 */
	protected static int SCENERY_WIDTH = 85;
	
	/**
	 * Image graphically representing the object
	 */
	protected Image spriteImage;

	/**
	 * Image height
	 */
	protected int height;
	
	/**
	 * Image width
	 */
	protected int width;

	/**
	 * Horizontal shifting for the image
	 */
	protected int xShift;

	/**
	 * Vertical shifting for the image
	 */
	protected int yShift;

	/**
	 * Boolean equals to true if the scenery is visible, false if the scenery is not
	 */
	protected boolean visible;

	/**
	 * Scenery class constructor with height and width as parameters
	 * 
	 * @param spritePath Path of the image used to represent the object
	 * @param height height of the object's pictural representaion
	 * @param width width of the object's pictural representation
	 */
	public Scenery(final String spritePath, final int height, final int width) {	
		Philophobia.getVerbose().calls("Creating Scenery object", "world/Scenery.java", "Scenery.Scenery(String, int, int)");

		try {
			spriteImage = ImageIO.read(new File(spritePath));
		} catch(IOException e) {
			Philophobia.getVerbose().warning("Scenery image \"" + spritePath + "\" load failed: " + e.getMessage(), "world/Scenery.java", "Scenery.Scenery(String, int, int)");
		}
		
		this.height = height;
		this.width = width;

		xShift = 0;
		yShift = 0;
	}

	/**
	 * Scenery class constructor with no optional parameters
	 *
	 * @param spritePath Path of the image used to represent the object
	 */
	public Scenery(final String spritePath) {
		Philophobia.getVerbose().calls("Creating Scenery object", "world/Scenery.java", "Scenery.Scenery(String)");

		try {
			spriteImage = ImageIO.read(new File(spritePath));

			height = spriteImage.getHeight(null);
			width = spriteImage.getWidth(null);

		} catch(IOException e) {
				Philophobia.getVerbose().warning("Scenery image \"" + spritePath + "\"  load failed: " + e.getMessage(), "world/Scenery.java", "Scenery.Scenery(String)");
				height = 0;
				width = 0;
		}

		xShift = 0;
		yShift = 0;
	}

	/**
	 * Scenery class constructor with height, width, x shifting and y shifting as parameters
	 *
	 * @param spritePath Path of the image used to represent the object
	 * @param height height of the object's pictural representation
	 * @param width width of the object's pictural representation
	 * @param xShift Horizontal shift of the image
	 * @param yShift Vertical shift or the image
	 */
	public Scenery(final String spritePath, final int height, final int width, final int xShift, final int yShift) {
		Philophobia.getVerbose().calls("Creating Scenery object", "world/Scenery.java", "Scenery.Scenery(String, int, int, int, int)");

		try {
			spriteImage = ImageIO.read(new File(spritePath));
		} catch(IOException e) {
			Philophobia.getVerbose().warning("Scenery image load failed: " + e.getMessage(), "world/Scenery.java", "Scenery.Scenery(String, int, int, int, int)");
		}
	
		this.height = height;
		this.width = width;

		this.xShift = xShift;
		this.yShift = yShift;
	}

	public void drawScenery(Graphics g, final int xLocation, final int yLocation, ImageObserver obs) {
		// drawImage(Image img, int x, int y, int width, int height, Observer obs);
	//	g.drawImage(spriteImage, xLocation + xShift, yLocation + yShift, width, height, obs);
		g.drawImage(spriteImage, xLocation + (int)(xShift*((float)SCENERY_WIDTH/(float)width)), yLocation + (int)(yShift*((float)SCENERY_WIDTH/(float)width)), SCENERY_WIDTH, (int)(height * ((float)SCENERY_WIDTH/(float)width)), obs);

		visible = true;
	}

	/**
	 * Getter for the SCENERY_HEIGHT static field
	 * @see #SCENERY_HEIGHT
	 */
	public static int getSceneryHeight() {
		return SCENERY_HEIGHT;
	}

	/**
	 * Getter for the SCENERY_WIDTH static field
	 * @see #SCENERY_WIDTH
	 */
	public static int getSceneryWidth() {
		return SCENERY_WIDTH;
	}
};
