package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;
import world.InteractiveObject;

/**
 * Class used to handle a water object
 */
public class Water extends Scenery implements InteractiveObject {

	/**
	 * Temparate broadleaf water type
	 */
	protected static String TEMPERATE_BROADLEAF = "temperatebroadleaf";

	/**
	 * Taiga water type
	 */
	protected static String TAIGA = "taiga";

	/**
	 * Alpine water type
	 */
	protected static String ALPINE_TUNDRA = "alpinetundra";

	/**
	 * Steppe water type
	 */
	protected static String STEPPE = "steppe";

	/**
	 * Cave water type
	 */
	protected static String CAVE = "cave";

	/**
	 * Polar desert water type
	 */
	protected static String POLAR_DESERT = "polardesert";

	/**
	 * Xeric shrublands water type
	 */
	protected static String XERIC_SHRUBLANDS = "xericshrublands";

	/**
	 * Savanna water type
	 */
	protected static String SAVANNA = "savanna";

	public Water(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "water.png");

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
