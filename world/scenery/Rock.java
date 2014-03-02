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
	 * Cave rock type
	 */
	protected static String CAVE = "cave";

	/**
	 * Polar desert rock type
	 */
	protected static String POLAR_DESERT = "polardesert";

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

	public static String CAVE() {
		return CAVE;
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

	}

	public void playerEnter() {

	}

	public void playerLeave() {

	}

	public boolean isTraversable() {
		return false;
	}



};
