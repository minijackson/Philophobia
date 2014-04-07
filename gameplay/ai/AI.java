/**
 * \package gameplay.ai
 * Package handling the sadistic AI of the game.
 */
package gameplay.ai;

import main.Philophobia;
import world.World;
import gameplay.ai.mood.Mood;
import gameplay.ai.mood.Curiosity;
import gameplay.ai.mood.Anger;
import gameplay.ai.mood.Depression;
import gameplay.ai.mood.PowerComplex;
import gameplay.ai.phrasing.Phrasing;

/**
 * Class representing the sadistic robot
 * <p>
 * The robot ask the player to do terrible things
 * without taking out the player's choice to do or
 * not to do the task
 * <p>
 * The AI has a mood system with 4 basic moods :
 * Curiosity, Anger, Depression, Power complex
 * <p>
 * The robot can switch between these moods considering
 * the user's choices and interact with the environment in
 * a bad way
 *
 * @see gameplay.ai.mood.Mood
 */
public class AI {

	/**
	 * World where the player is currently in
	 */
	protected World currentWorld;

	/**
	 * Mood in which the AI is currently in
	 */
	protected Mood currentMood;

	/**
	 * AI talk system
	 */
	protected Phrasing phrasingSystem;

	/**
	 * Number of betrayals done by the player
	 */
	protected int betrayalCount;

	/**
	 * Number of asked actions by the AI
	 * done by the player 
	 */
	protected int slaveryCount;

	/**
	 * AI class main constructor
	 * @param currentWorld World where the player is currently in
	 */
	public AI(World currentWorld) {
		Philophobia.getVerbose().information("Creating sadistic AI", "gameplay/ai/AI.java", "AI.AI(World)");

		this.currentWorld = currentWorld;
		currentMood  = new Curiosity();
		phrasingSystem = new Phrasing();
		betrayalCount = 0;
		slaveryCount = 0;
	}

	/**
	 * Setter for the current world field
	 * @see #currentWorld
	 */
	public void setCurrentWorld(World world) {
		currentWorld = world;
	}

	// ===================
	// == Moods part ==
	// ===================

	/**
	 * Method called when the player
	 * make a new betrayal
	 * (does not do what the AI asked)
	 */
	public void newBetrayal() {
		Philophobia.getVerbose().calls("New betrayal action detected", "gameplay/ai/AI.java", "AI.newBetrayal()");
		betrayalCount++;
		if(currentMood.incrementBetrayalCount() >= currentMood.getBetrayalThreshold()) {
			changeMood(currentMood.getNextMood());
		}
	}

	/**
	 * Method called when the player
	 * do what the AI asked
	 */
	public void newSlavery() {
		Philophobia.getVerbose().calls("New slavery action detected", "gameplay/ai/AI.java", "AI.newSlavery()");
		slaveryCount++;
		if(currentMood.incrementSlaveryCount() >= currentMood.getSlaveryThreshold()) {
			changeMood(currentMood.getPreviousMood());
		}
	}

	/**
	 * Change the current mood field
	 * from a Class object
	 * @see #currentMood
	 */
	protected void changeMood(Class<Mood> moodClass) {	
		try {
			Philophobia.getVerbose().information("AI switching from " + currentMood.getClass().getName() + " mood to " + moodClass.getName() + " mood", "gameplay/ai/AI.java", "AI.changeMood(Class)");
			currentMood = moodClass.newInstance();
		} catch(SecurityException e) {
			Philophobia.getVerbose().serious("Security exception when switching from " + currentMood.getClass().getName() + " mood to " + moodClass.getName() + " mood: " + e.getMessage(), "gameplay/ai/AI.java", "AI.changeMood(Class)");
		} catch(InstantiationException e) {
			Philophobia.getVerbose().serious("Instantiation exception when switching from " + currentMood.getClass().getName() + " mood to " + moodClass.getName() + " mood: " + e.getMessage(), "gameplay/ai/AI.java", "AI.changeMood(Class)");
		} catch(IllegalAccessException e) {
			Philophobia.getVerbose().serious("Illegal access exception when switching from " + currentMood.getClass().getName() + " mood to " + moodClass.getName() + " mood: " + e.getMessage(), "gameplay/ai/AI.java", "AI.changeMood(Class)");
		} 
	}
};
