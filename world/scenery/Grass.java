package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;

/**
 * Class used to handle a grass object
 */
public class Grass extends Scenery {

	/**
	 * Temparate broadleaf grass type
	 */
	protected static String TEMPERATE_BROADLEAF = "temperatebroadleaf";

	/**
	 * Taiga grass type
	 */
	protected static String TAIGA = "taiga";

	/**
	 * Alpine grass type
	 */
	protected static String ALPINE_TUNDRA = "alpinetundra";

	/**
	 * Steppe grass type
	 */
	protected static String STEPPE = "steppe";

	/**
	 * Savanna grass type
	 */
	protected static String SAVANNA = "savanna";

	public Grass(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "grass.png");

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

	public static String SAVANNA() {
		return SAVANNA;
	}

};
