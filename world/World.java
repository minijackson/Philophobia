package world;

import main.Philophobia;
import world.scenery.*;
import world.character.*;

import debug.Verbose;
import javax.swing.JFrame;
import java.awt.Graphics;

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
	 * Style of the world
	 */
	protected String type;

	/**
	 * World class constructor
	 * @param type Style of the world
	 */
	public World(final String type) {
		Philophobia.getVerbose().information("Creating World class", "world/World.java", "World.World(String)");

		this.type = type;
		this.sizeX = 128;
		this.sizeY = 128;

		generateWorld();
	}

	/**
	 * World class constructor with size parameters
	 * @param style Style of the world
	 * @param sizeX Horizontal size of the world
	 * @param sizeY Vertical size of the world
	 */
	public World(final String type, final int sizeX, final int sizeY) {
		Philophobia.getVerbose().information("Creating World class", "world/World.java", "World.World(String, int, int)");

		this.type = type;
		this.sizeX = sizeX;
		this.sizeY = sizeY;

		generateWorld();
	}

	/**
	 * Function randomly generating the world
	 */
	protected void generateWorld() {
		map = new Scenery[sizeX][sizeY];

		// Loop generating the world
		for(int i = 0 ; i < sizeX ; ++i) {
			for(int j = 0 ; i < sizeY ; ++j) {

				float random = Math.random();

				Scenery currentScenery;

				if(0 <= random < .3) {
//					currentScenery = new Tree(type);
				} else if(.3 <= random .6) {
//					currentScenery = new Rock(type);
				} else {
//					currencScenery = new Ground(type);
				}

				try {
					map[i][j] = sceneryObject.newInstance();
				} catch (SecurityException e) {
					Philophobia.getVerbose().critical("Security exception when generating the world: " + e.getMessage(), "world/World.java", "world.generateWorld()");
					System.exit(-1);
				} catch (InstantiationException e) {
					Philophobia.getVerbose().critical("Instantiation exception when generating the world: " + e.getMessage(), "world/World.java", "world.generateWorld()");
				} catch (IllegalAccessException e) {
					Philophobia.getVerbose().critical("Illegal access exception when generating the world: " + e.getMessage(), "world/World.java", "world.generateWorld()");
				}
			}
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
	public Scenery[][] getMap() {
		return this.map;
	}
};
