package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;

import world.scenery.TemperateBroadleafTheme;
import world.scenery.TaigaTheme;
import world.scenery.AlpineTundraTheme;

/**
 * Class used to handle a flower object
 */
public class Flower extends Scenery implements TemperateBroadleafTheme, TaigaTheme, AlpineTundraTheme {

	/**
	 * Flower class constructor
	 * @param type Style of the flower
	 */
	public Flower(final String type) {

		super(Philophobia.getImageFilePrefix() + type + "flower.png");

	}
};
