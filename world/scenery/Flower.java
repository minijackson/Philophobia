package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;

/**
 * Class used to handle a flower object
 */
public class Flower extends Scenery {

	/**
	 * Temparate broadleaf flower type
	 */
	protected static String TEMPERATE_BROADLEAF = "temperatebroadleaf";

	/**
	 * Taiga flower type
	 */
	protected static String TAIGA = "taiga";

	/**
	 * Alpine tundra flower type
	 */
	protected static String ALPINE_TUNDRA = "alpinetundra";

	public Flower(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "flower.png");

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



};
