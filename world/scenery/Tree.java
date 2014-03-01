package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;
import world.InteractiveObject;

/**
 * Class used to handle a tree object
 */
public class Tree extends Scenery implements InteractiveObject {

	/**
	 * Temparate broadleaf tree type
	 */
	protected static String TEMPERATE_BROADLEAF = "temperatebroadleaf";

	/**
	 * Taiga tree type
	 */
	protected static String TAIGA = "taiga";

	/**
	 * Alpine tree type
	 */
	protected static String ALPINE_TUNDRA = "alpinetundra";

	/**
	 * Steppe tree type
	 */
	protected static String STEPPE = "steppe";

	/**
	 * Cave tree type
	 */
	protected static String CAVE = "cave";

	/**
	 * Polar desert tree type
	 */
	protected static String POLAR_DESERT = "polardesert";

	/**
	 * Xeric shrublands tree type
	 */
	protected static String XERIC_SHRUBLANDS = "xericshrublands";

	/**
	 * Savanna tree type
	 */
	protected static String SAVANNA = "savanna";

	public Tree(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "tree.png");

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
