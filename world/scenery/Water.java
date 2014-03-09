package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;
import world.InteractiveObject;

import world.scenery.TaigaTheme;
import world.scenery.PolarDesertTheme;

/**
 * Class used to handle a water object
 */
public class Water extends Scenery implements InteractiveObject, TaigaTheme, PolarDesertTheme {

	/**
	 * Water class constructor
	 * @param type Style of the water
	 */
	public Water(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "water.png");

	}

	// ===============================
	// == InteractiveObject methods ==
	// ===============================
	
	public void triggerAction() {

	}

	public void playerNear() {
		// AI talking
	}

	public void playerEnter() {

	}

	public void playerLeave() {

	}

	public boolean isTraversable() {
		return false;
	}



};
