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

	/**
	 * Shore class constructor
	 * @param type Theme of the sprite (see static fields)
	 * @param orientation Orientation of the sprite (possible : "n", "s", "e", "w", "nee", "nwe", "nei", "nwi", "see", "swe", "sei", "swi")
	 */
	public Shore(final String type, final String orientation) {

		super(Philophobia.getImageFilePrefix() + type + "shore" + orientation + ".png");

	}

	public static String TAIGA() {
		return TAIGA;
	}

	public static String POLAR_DESERT() {
		return POLAR_DESERT;
	}

};
