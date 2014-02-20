package world;

import main.Philophobia;
import world.Scenery;

import debug.Verbose;
import javax.swing.JFrame;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * World is a class used to handle the game world graphics
 * <p>
 * The World class use the Scenery objects (or the objects
 * implementing the Scenery class) to display images of
 * several objects corresponding to trees and traps and so on
 */
public class World {
	
	/**
	 * Boolean equals to true if the world is visible, false is the world is not
	 */
	protected boolean visible;

	/**
	 * Horizontal size of the map
	 */
	protected int sizeX;

	/**
	 * Vertical size of the map
	 */
	protected int sizeY;

	/**
	 * Two-dimensional array containing all objects within the world
	 * <p>
	 * This object is filled using a file in the root directory
	 * and in the form of map[x][y] from top-left to right-bottom
	 */
	protected Scenery[][] map;

	/**
	 * World class constructor
	 * @param filename filename containing the data of the current map
	 */
	public World(String filename) {
		Philophobia.getVerbose().information("World class creation", "world/World.java", "World.World(String)");

		this.visible = false;

		try {

			BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(new File(filename)));
			
			while(inputStream.read() != -1) {
				// Count
			}

			sizeX = 42;
			sizeY = 42;

			this.map = new Scenery[sizeX][sizeY];

			while(inputStream.read() != -1) {
				// Fill this.map
			}

		} catch(FileNotFoundException e) {

			Philophobia.getVerbose().critical("File " + filename + " not found", "world/World.java", "World.World(String)");
			System.exit(-1);

		} catch(IOException e) {
			Philophobia.getVerbose().serious("Error reading the file " + filename, "world/World.java", "World.World(String)");
		}
	}

	public void show() {
		this.visible = true;
	}

};
