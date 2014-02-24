package world;

import main.Philophobia;
import world.Scenery;

import debug.Verbose;
import javax.swing.JFrame;
import java.awt.Graphics;
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
	 * @param canvasHeight Height of the canvas in which we draw the world
	 * @param canvasWidth Widht of the canvas in which we draw the world
	 */
	public World(String filename, int canvasHeight, int canvasWidth) {
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

	/**
	 * Getter for the sizeX Field
	 * @return int Horizontal size of the map (in Scenery objects)
	 * @see #sizeX
	 */
	public int getSizeX() {
		return this.sizeX;
	}

	/**
	 * Getter for the sizeY Field
	 * @return int Vertical size of the map (in Scenery objects)
	 * @see #sizeY
	 */
	public int getSizeY() {
		return this.sizeY;
	}

	/**
	 * Getter for the map Field
	 * @return Scenery[][] The map of the world
	 * @see #map
	 */
	public int getMap() {
		return this.map;
	}
};
