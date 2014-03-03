package gameplay.ai;

import world.World;

/**
 * Class representing the sadistic robot
 * <p>
 * The robot ask the player to do terrible things
 * without taking out the player's choice to do or
 * not to do the task
 * <p>
 * The AI has a feeling system with 4 basic feelings :
 * Curiosity, Anger, Depression, Power complex
 * <p>
 * The robot can switch between these feelings considering
 * the user's choices
 * <p>
 * If the player does not the asked task, the robot
 *
 * @see gameplay.ai.feelings
 */
public class AI {

	/**
	 * World where the player is currently in
	 */
	protected World currentWorld;

	public AI(World currentWorld) {

	}

}
