package org.world;

import org.debug.Verbose;
import javax.swing.JFrame;

public class World {
	
	private boolean visible;

	public World(Canvas windowCanvas, Verbose verbose) {
		visible = false;

		Philophobia.getVerbose().information("World class created", "org/world/World.java", "World.World(Verbose)");
	}

	public void show() {}

};
