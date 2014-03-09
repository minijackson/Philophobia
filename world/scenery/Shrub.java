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
 * Class used to handle a shrub object
 */
public class Shrub extends Scenery implements TemperateBroadleafTheme, TaigaTheme, AlpineTundraTheme, SteppeTheme, CaveTheme, PolarDesertTheme, XericShrublandsTheme, SavannaTheme {

	/**
	 * Shrub class constructor
	 * @param type Style of the shrub
	 */
	public Shrub(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "shrub.png");

	}
};
