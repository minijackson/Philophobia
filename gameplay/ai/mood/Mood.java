/**
 * \package gameplay.ai.mood
 * Package handling the mood system for the AI.
 */
package gameplay.ai.mood;

import main.Philophobia;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Abstract class representing an
 * AI mood
 */
public abstract class Mood {

	/**
	 * If the betrayal count goes
	 * above the betrayal threshold,
	 * then the robot must change its
	 * current mood (randomness required)
	 */
	protected int betrayalThreshold;

	/**
	 * If the slavery count goes
	 * above the betrayal threshold,
	 * then the robot must change its
	 * current mood (randomness required)
	 */
	protected int slaveryThreshold;

	/**
	 * Number of betrayals (requests from
	 * the AI not done by the user)
	 * done by the user when the AI
	 * was currently in this mood
	 * state
	 */
	protected int moodsBetrayalCount;

	/**
	 * Number of requests from the AI
	 * done positively by the user when
	 * the AI was in this mood state
	 */
	protected int moodsSlaveryCount;

	/**
	 * Associative array containing the possible
	 * moods if the number of betrayals
	 * (when the AI was in this mood state)
	 * is greater than its threshold
	 * with the probability associated
	 */
	protected HashSet<ProbabilityMood> nextMoods;

	/**
	 * Associative array containing the possible
	 * moods if the number of done actions asked
	 * by the AI is greater than its threshold
	 * with the probability associated
	 */
	protected HashSet<ProbabilityMood> previousMoods;

	/**
	 * Mood constructor
	 */
	public Mood(int betrayalThreshold, int slaveryThreshold) {

		Philophobia.getVerbose().information("Creating new Mood class", "gameplay/ai/mood/Mood.java", "Mood.Mood(int, int)");

		this.betrayalThreshold = betrayalThreshold;
		this.slaveryThreshold = slaveryThreshold;

	}

	/**
	 * Getter for the betrayal threshold field
	 * @see #betrayalThreshold
	 */
	public int getBetrayalThreshold() {
		return betrayalThreshold;
	}

	/**
	 * Getter for the slavery threshold field
	 * @see #slaveryThreshold
	 */
	public int getSlaveryThreshold() {
		return slaveryThreshold;
	}

	/**
	 * Getter for the betrayal count field
	 * @see #moodsBetrayalCount
	 */
	public int getMoodsBetrayalCount() {
		return moodsBetrayalCount;
	}

	/**
	 * Getter for the slavery count field
	 * @see #moodsSlaveryCount
	 */
	public int getMoodsSlaveryThreshold() {
		return moodsSlaveryCount;
	}

	/**
	 * Increment and return the betrayal count field
	 * @see #moodsBetrayalCount
	 */
	public int incrementBetrayalCount() {
		return ++moodsBetrayalCount;
	}

	/**
	 * Increment and return the slavery count field
	 * @see #moodsSlaveryCount
	 */
	public int incrementSlaveryCount() {
		return ++moodsSlaveryCount;
	}

	/**
	 * When the betrayal threshold is exceeded,
	 * this function is called and return a new
	 * mood given their probabilities
	 */
	public Class<Mood> getNextMood() {
		Iterator<ProbabilityMood> it = nextMoods.iterator();
		ProbabilityMood probMood = null;
		while(it.hasNext()) {

			probMood = it.next();
			if(Math.random() >= probMood.getProbability()) {
				return probMood.getMood();
			}

		}

		return probMood.getMood();
	}

	/**
	 * When the slavery threshold is exceeded,
	 * this function is called and return a new
	 * mood given their probabilities
	 */
	public Class<Mood> getPreviousMood() {
		Iterator<ProbabilityMood> it = previousMoods.iterator();
		ProbabilityMood probMood = null;
		while(it.hasNext()) {

			probMood = it.next();
			if(Math.random() >= probMood.getProbability()) {
				return probMood.getMood();
			}

		}

		return probMood.getMood();
	}

};

/**
 * Class used to associate a
 * mood with a probability
 */
class ProbabilityMood {

	/**
	 * Mood for which there is
	 * a probability to be chosen
	 */
	protected Class<Mood> mood;

	/**
	 * Probability of the mood
	 * to be chosen
	 */
	protected double probability;

	/**
	 * Constructor of the probability
	 * mood class
	 */
	public ProbabilityMood(Class<Mood> mood, double probability) {
		this.mood = mood;
		this.probability = probability;
	}

	/**
	 * Getter for the mood field
	 * @see #mood
	 */
	public Class<Mood> getMood() {
		return mood;
	}

	/**
	 * Getter for the probability field
	 * @see #probability
	 */
	public double getProbability() {
		return probability;
	}

};
