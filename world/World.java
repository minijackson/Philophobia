package world;

import main.Philophobia;
import world.Scenery;

import debug.Verbose;
import javax.swing.JFrame;

/**
 * World is a class used to handle the game world graphics
 * <p>
 * The World class use the Scenery objects (or the objects
 * implementing the Scenery class) to display images of
 * several objects corresponding to trees and traps and so on
 */
public class World {
	
	private boolean visible;

	/**
	 * World class constructor
	 */
	public World() {
		Philophobia.getVerbose().information("World class created", "org/world/World.java", "World.World(Verbose)");	

		visible = false;
	}

	public void show() {
	
	}

};
