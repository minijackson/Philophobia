package world.scenery;

import main.Philophobia;
import world.scenery.Scenery;

public interface InteractiveObject {

	/**
	 * Method to be called when the player
	 * is near the object and presses the
	 * action key
	 */
	public void triggerAction();

	/**
	 * Method to be called when the player
	 * is near the object
	 */
	public void playerNear();

	/**
	 * Method to be called when the player
	 * was near and is now over the object
	 */
	public void playerEnter();

	/**
	 * Method to be called when the player
	 * was over and is now near the object
	 */
	public void playerLeave();

	/**
	 * Returns true if the player is able
	 * to pass through the object and
	 * false if the player is not able
	 * to cross the object
	 */
	public boolean isTraversable();

};
