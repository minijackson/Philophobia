package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;

/**
 * Class used to handle a shore object
 */
public class Shore extends Scenery {

	/**
	 * Temparate broadleaf shore type
	 */
	protected static String TEMPERATE_BROADLEAF = "temperatebroadleaf";

	/**
	 * Taiga shore type
	 */
	protected static String TAIGA = "taiga";

	/**
	 * Alpine shore type
	 */
	protected static String ALPINE_TUNDRA = "alpinetundra";

	/**
	 * Steppe shore type
	 */
	protected static String STEPPE = "steppe";

	/**
	 * Cave shore type
	 */
	protected static String CAVE = "cave";

	/**
	 * Polar desert shore type
	 */
	protected static String POLAR_DESERT = "polardesert";

	/**
	 * Xeric shrublands shore type
	 */
	protected static String XERIC_SHRUBLANDS = "xericshrublands";

	/**
	 * Savanna shore type
	 */
	protected static String SAVANNA = "savanna";

	public Shore(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "shore.png");

	}

	public static String TEMPERATE_BROADLEAF() {
		return TEMPERATE_BROADLEAF;
	}

	public static String TAIGA() {
		return TAIGA;
	}

	public static String ALPINE_TUNDRA() {
		return ALPINE_TUNDRA;
	}

	public static String STEPPE() {
		return STEPPE;
	}

	public static String CAVE() {
		return CAVE;
	}

	public static String POLAR_DESERT() {
		return POLAR_DESERT;
	}

	public static String XERIC_SHRUBLANDS() {
		return XERIC_SHRUBLANDS;
	}

	public static String SAVANNA() {
		return SAVANNA;
	}

};
