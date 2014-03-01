package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;

/**
 * Class used to handle a ground object
 */
public class Ground extends Scenery {

	/**
	 * Temparate broadleaf ground type
	 */
	protected static String TEMPERATE_BROADLEAF = "temperatebroadleaf";

	/**
	 * Taiga ground type
	 */
	protected static String TAIGA = "taiga";

	/**
	 * Alpine ground type
	 */
	protected static String ALPINE_TUNDRA = "alpinetundra";

	/**
	 * Steppe ground type
	 */
	protected static String STEPPE = "steppe";

	/**
	 * Cave ground type
	 */
	protected static String CAVE = "cave";

	/**
	 * Polar desert ground type
	 */
	protected static String POLAR_DESERT = "polardesert";

	/**
	 * Xeric shrublands ground type
	 */
	protected static String XERIC_SHRUBLANDS = "xericshrublands";

	/**
	 * Savanna ground type
	 */
	protected static String SAVANNA = "savanna";

	public Ground(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "ground.png");

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
