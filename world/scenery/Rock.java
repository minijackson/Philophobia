package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;
import world.InteractiveObject;

/**
 * Class used to handle a rock object
 */
public class Rock extends Scenery implements InteractiveObject {

	/**
	 * Temparate broadleaf rock type
	 */
	protected static String TEMPERATE_BROADLEAF = "temperatebroadleaf";

	/**
	 * Taiga rock type
	 */
	protected static String TAIGA = "taiga";

	/**
	 * Alpine rock type
	 */
	protected static String ALPINE_TUNDRA = "alpinetundra";

	/**
	 * Steppe rock type
	 */
	protected static String STEPPE = "steppe";

	/**
	 * Cave rock type
	 */
	protected static String CAVE = "cave";

	/**
	 * Polar desert rock type
	 */
	protected static String POLAR_DESERT = "polardesert";

	/**
	 * Xeric shrublands rock type
	 */
	protected static String XERIC_SHRUBLANDS = "xericshrublands";

	/**
	 * Savanna rock type
	 */
	protected static String SAVANNA = "savanna";

	public Rock(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "rock.png");

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

	}

	public void playerEnter() {

	}

	public void playerLeave() {

	}

	public boolean isTraversable() {
		return false;
	}



};
