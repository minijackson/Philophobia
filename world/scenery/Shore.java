package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;

import world.scenery.TaigaTheme;
import world.scenery.PolarDesertTheme;

/**
 * Class used to handle a shore object
 */
public class Shore extends Scenery implements TaigaTheme, PolarDesertTheme {

	/**
	 * Shore class constructor
	 * @param type Style of the shore
	 * @param orientation Orientation of the sprite (possible : "n", "s", "e", "w", "nee", "nwe", "nei", "nwi", "see", "swe", "sei", "swi")
	 */
	public Shore(final String type, final String orientation) {

		super(Philophobia.getImageFilePrefix() + type + "shore" + orientation + ".png");

	}
};
