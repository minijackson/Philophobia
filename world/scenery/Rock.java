package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;
import world.InteractiveObject;

import world.scenery.TemperateBroadleafTheme;
import world.scenery.TaigaTheme;
import world.scenery.AlpineTundraTheme;
import world.scenery.CaveTheme;
import world.scenery.PolarDesertTheme;

/**
 * Class used to handle a rock object
 */
public class Rock extends Scenery implements InteractiveObject, TemperateBroadleafTheme, TaigaTheme, AlpineTundraTheme, CaveTheme, PolarDesertTheme {

	/**
	 * Rock class constructor
	 * @param type Style of the rock
	 */
	public Rock(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "rock.png");

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
