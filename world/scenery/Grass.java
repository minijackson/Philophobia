package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;

import world.scenery.TemperateBroadleafTheme;
import world.scenery.TaigaTheme;
import world.scenery.AlpineTundraTheme;
import world.scenery.SteppeTheme;
import world.scenery.SavannaTheme;

/**
 * Class used to handle a grass object
 */
public class Grass extends Scenery implements TemperateBroadleafTheme, TaigaTheme, AlpineTundraTheme, SteppeTheme, SavannaTheme {

	/**
	 * Grass class constructor
	 * @param type Style of the grass
	 */
	public Grass(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "grass.png");

	}
};
