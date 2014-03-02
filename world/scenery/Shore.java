package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;

/**
 * Class used to handle a shore object
 */
public class Shore extends Scenery {

	/**
	 * Taiga shore type
	 */
	protected static String TAIGA = "taiga";

	/**
	 * Polar desert shore type
	 */
	protected static String POLAR_DESERT = "polardesert";

	public Shore(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "shore.png");

	}

	public static String TAIGA() {
		return TAIGA;
	}

	public static String POLAR_DESERT() {
		return POLAR_DESERT;
	}

};
