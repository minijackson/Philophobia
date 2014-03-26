package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;
import world.InteractiveObject;

import world.scenery.TemperateBroadleafTheme;
import world.scenery.TaigaTheme;
import world.scenery.AlpineTundraTheme;
import world.scenery.SteppeTheme;
import world.scenery.CaveTheme;
import world.scenery.PolarDesertTheme;
import world.scenery.XericShrublandsTheme;
import world.scenery.SavannaTheme;

/**
 * Class used to handle a tree object
 */
public class Tree extends Scenery implements InteractiveObject, TemperateBroadleafTheme, TaigaTheme, AlpineTundraTheme, SteppeTheme, CaveTheme, PolarDesertTheme, XericShrublandsTheme, SavannaTheme {

	/**
	 * Tree class constructor
	 * @param type Style of the tree
	 */
	public Tree(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "tree.png", 96, Scenery.getSceneryWidth(), 0, -48);

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
