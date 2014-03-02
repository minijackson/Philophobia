package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;
import world.InteractiveObject;

/**
 * Class used to handle a water object
 */
public class Water extends Scenery implements InteractiveObject {

	/**
	 * Taiga water type
	 */
	protected static String TAIGA = "taiga";

	/**
	 * Polar desert water type
	 */
	protected static String POLAR_DESERT = "polardesert";

	public Water(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "water.png");

	}

	public static String TAIGA() {
		return TAIGA;
	}

	public static String POLAR_DESERT() {
		return POLAR_DESERT;
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
