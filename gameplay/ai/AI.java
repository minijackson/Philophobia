package gameplay.ai;

import main.Philophobia;
import world.World;
import gameplay.ai.feeling.Feeling;
import gameplay.ai.feeling.Curiosity;
import gameplay.ai.feeling.Anger;
import gameplay.ai.feeling.Depression;
import gameplay.ai.feeling.PowerComplex;

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
 * the user's choices and interact with the environment in
 * a bad way
 *
 * @see gameplay.ai.feelings
 */
public class AI {

	/**
	 * World where the player is currently in
	 */
	protected World currentWorld;

	/**
	 * Feeling in which the AI is currently in
	 */
	protected Feeling currentFeeling;

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
		currentFeeling  = new Curiosity();
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
	// == Feelings part ==
	// ===================

	/**
	 * Method called when the player
	 * make a new betrayal
	 * (does not do what the AI asked)
	 */
	public void newBetrayal() {
		betrayalCount++;
		if(currentFeeling.incrementBetrayalCount() >= currentFeeling.getBetrayalThreshold()) {

			Class newFeelingClass = currentFeeling.getNextFeeling();

			try {
				Philophobia.getVerbose().information("AI switching from " + currentFeeling.getClass().getName() + " feeling to " + newFeelingClass.getName() + " feeling", "gameplay/ai/AI.java", "AI.newBetrayal()");
				newFeelingClass.newInstance();
			} catch(SecurityException e) {
				Philophobia.getVerbose().serious("Security exception when switching from " + currentFeeling.getClass().getName() + " feeling to " + newFeelingClass.getName() + " feeling: " + e.getMessage(), "gameplay/ai/AI.java", "AI.newBetrayal()");
			} catch(InstantiationException e) {
				Philophobia.getVerbose().serious("Instanciation exception when switching from " + currentFeeling.getClass().getName() + " feeling to " + newFeelingClass.getName() + " feeling: " + e.getMessage(), "gameplay/ai/AI.java", "AI.newBetrayal()");
			} catch(IllegalAccessException e) {
				Philophobia.getVerbose().serious("Illegal access exception when switching from " + currentFeeling.getClass().getName() + " feeling to " + newFeelingClass.getName() + " feeling: " + e.getMessage(), "gameplay/ai/AI.java", "AI.newBetrayal()");
			} 
		}
	}

	/**
	 * Method called when the player
	 * do what the AI asked
	 */
	public void newSlavery() {
		slaveryCount++;
		if(currentFeeling.incrementSlaveryCount() >= currentFeeling.getSlaveryThreshold()) {
			
			Class newFeelingClass = currentFeeling.getPreviousFeeling();

			try {
				Philophobia.getVerbose().information("AI switching from " + currentFeeling.getClass().getName() + " feeling to " + newFeelingClass.getName() + " feeling", "gameplay/ai/AI.java", "AI.newSlavery()");
				newFeelingClass.newInstance();
			} catch(SecurityException e) {
				Philophobia.getVerbose().serious("Security exception when switching from " + currentFeeling.getClass().getName() + " feeling to " + newFeelingClass.getName() + " feeling: " + e.getMessage(), "gameplay/ai/AI.java", "AI.newSlavery()");
			} catch(InstantiationException e) {
				Philophobia.getVerbose().serious("Instanciation exception when switching from " + currentFeeling.getClass().getName() + " feeling to " + newFeelingClass.getName() + " feeling: " + e.getMessage(), "gameplay/ai/AI.java", "AI.newSlavery()");
			} catch(IllegalAccessException e) {
				Philophobia.getVerbose().serious("Illegal access exception when switching from " + currentFeeling.getClass().getName() + " feeling to " + newFeelingClass.getName() + " feeling: " + e.getMessage(), "gameplay/ai/AI.java", "AI.newBetrayal()");
			} 
		}
	}

};
