package world;

import main.Philophobia;

import java.awt.Graphics;
import java.io.File;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.util.Observer;
import java.io.IOException;

/**
 * Class used to handle any world object
 * <p>
 * The Scenery class is used to handle the objects
 * that are displayed in the graphical game world.
 */
public class Scenery {
	
	protected Image spriteImage;
	protected int height;
	protected int width;
	protected int xShift;
	protected int yShift;

	/**
	 * Scenery class constructor with height and width as parameters
	 * 
	 * @param spritePath Path of the image used to represent the object
	 * @param height height of the object's pictural representaion
	 * @param width width of the object's pictural representation
	 */
	public Scenery(final String spritePath, final int height, final int width) {
		try {
			spriteImage = ImageIO.read(new File(spritePath));
		} catch(IOException e) {
			Philophobia.getVerbose().warning("Scenery image load failed: " + e.getMessage(), "world/Scenery.java", "Scenery.Scenery(Image, int, int)");
		}
		
		this.height = height;
		this.width = width;

		xShift = 0;
		yShift = 0;

		Philophobia.getVerbose().calls("Scenery object created", "world/Scenery.java", "Scenery.Scenery(Image, int, int)");
	}

	/**
	 * Scenery class constructor with no optional parameters
	 *
	 * @param spritePath Path of the image used to represent the object
	 */
	public Scenery(final String spritePath) {
		try {
			spriteImage = ImageIO.read(new File(spritePath));
		} catch(IOException e) {
				Philophobia.getVerbose().warning("Scenery image load failed: " + e.getMessage(), "world/Scenery.java", "Scenery.Scenery(Image)");
		}
		
		
		height = spriteImage.getHeight();
		width = spriteImage.getWidth();

		xShift = 0;
		yShift = 0;

		Philophobia.getVerbose().calls("Scenery object created", "world/Scenery.java", "Scenery.Scenery(Image)");
	}

	/**
	 * Scenery class constructor with height, width, x shifting and y shifting as parameters
	 *
	 * @param spritePath Path of the image used to represent the object
	 * @param height height of the object's pictural representaion
	 * @param width width of the object's pictural representation
	 * @param xShift Horizontal shift of the image
	 * @param yShift Vertical shift or the image
	 */
	public Scenery(final String spritePath, final int height, final int width, final int xShift, final int yShift) {
		try {
			spriteImage = ImageIO.read(new File(spritePath));
		} catch(IOException e) {
			Philophobia.getVerbose().warning("Scenery image load failed: " + e.getMessage(), "world/Scenery.java", "Scenery.Scenery(Image, int, int, int, int)");
		}
	
		this.height = height;
		this.width = width;

		this.xShift = xShift;
		this.yShift = yShift;

		Philophobia.getVerbose().calls("Scenery object created", "world/Scenery.java", "Scenery.Scenery(Image, int, int, int, int)");
	}

	public void drawScenery(Graphics g, final int xLocation, final int yLocation, Observer obs) {
		// drawImage(Image img, int x, int y, int width, int height, Observer obs);
		g.drawImage(spriteImage, xLocation + xShift, yLocation + yShift, width, height, obs);
	}

};
