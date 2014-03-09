package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;

import world.scenery.TemperateBroadleafTheme;
import world.scenery.TaigaTheme;
import world.scenery.AlpineTundraTheme;
import world.scenery.SteppeTheme;
import world.scenery.CaveTheme;
import world.scenery.PolarDesertTheme;
import world.scenery.XericShrublandsTheme;
import world.scenery.SavannaTheme;

/**
 * Class used to handle a ground object
 */
public class Ground extends Scenery implements TemperateBroadleafTheme, TaigaTheme, AlpineTundraTheme, SteppeTheme, CaveTheme, PolarDesertTheme, XericShrublandsTheme, SavannaTheme {

	/**
	 * Ground class constructor
	 * @param type Style of the ground
	 */
	public Ground(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "ground.png");

	}
};
