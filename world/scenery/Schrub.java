package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;

/**
 * Class used to handle a shrub object
 */
public class Shrub extends Scenery {

	/**
	 * Temparate broadleaf shrub type
	 */
	protected static String TEMPERATE_BROADLEAF = "temperatebroadleaf";

	/**
	 * Taiga shrub type
	 */
	protected static String TAIGA = "taiga";

	/**
	 * Alpine shrub type
	 */
	protected static String ALPINE_TUNDRA = "alpinetundra";

	/**
	 * Steppe shrub type
	 */
	protected static String STEPPE = "steppe";

	/**
	 * Cave shrub type
	 */
	protected static String CAVE = "cave";

	/**
	 * Polar desert shrub type
	 */
	protected static String POLAR_DESERT = "polardesert";

	/**
	 * Xeric shrublands shrub type
	 */
	protected static String XERIC_SHRUBLANDS = "xericshrublands";

	/**
	 * Savanna shrub type
	 */
	protected static String SAVANNA = "savanna";

	public Shrub(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "shrub.png");

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
