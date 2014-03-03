package gameplay.ai.feeling;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Abstract class representing an
 * AI feeling
 */
public abstract class Feeling {

	/**
	 * If the betrayal count goes
	 * above the betrayal threshold,
	 * then the robot must change its
	 * current feeling (randomness required)
	 */
	protected int betrayalThreshold;

	/**
	 * If the slavery count goes
	 * above the betrayal threshold,
	 * then the robot must change its
	 * current feeling (randomness required)
	 */
	protected int slaveryThreshold;

	/**
	 * Number of betrayals (requests from
	 * the AI not done by the user)
	 * done by the user when the AI
	 * was currently in this feeling
	 * state
	 */
	protected int feelingsBetrayalCount;

	/**
	 * Number of requests from the AI
	 * done positively by the user when
	 * the AI was in this feeling state
	 */
	protected int feelingsSlaveryCount;

	/**
	 * Associative array containing the possible
	 * feelings if the number of betrayals
	 * (when the AI was in this feeling state)
	 * is greater than its threshold
	 * with the probability associated
	 */
	protected HashSet<ProbabilityFeeling> nextFeelings;

	/**
	 * Associative array containing the possible
	 * feelings if the number of done actions asked
	 * by the AI is greater than its threshold
	 * with the probability associated
	 */
	protected HashSet<ProbabilityFeeling> previousFeelings;

	/**
	 * Feeling constructor
	 */
	public Feeling(int betrayalThreshold, int slaveryThreshold) {

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
	 * @see #feelingsBetrayalCount
	 */
	public int getFeelingsBetrayalCount() {
		return feelingsBetrayalCount;
	}

	/**
	 * Getter for the slavery count field
	 * @see #feelingsSlaveryCount
	 */
	public int getFeelingsSlaveryThreshold() {
		return feelingsSlaveryCount;
	}

	/**
	 * Increment and return the betrayal count field
	 * @see #feelingsBetrayalCount
	 */
	public int incrementBetrayalCount() {
		return ++feelingsBetrayalCount;
	}

	/**
	 * Increment and return the slavery count field
	 * @see #feelingsSlaveryCount
	 */
	public int incrementSlaveryCount() {
		return ++feelingsSlaveryCount;
	}

	/**
	 * When the betrayal threshold is exceeded,
	 * this function is called and return a new
	 * feeling given their probabilities
	 */
	public Class getNextFeeling() {
		Iterator<ProbabilityFeeling> it = nextFeelings.iterator();
		ProbabilityFeeling probFeeling = null;
		while(it.hasNext()) {

			probFeeling = it.next();
			if(Math.random() >= probFeeling.getProbability()) {
				return probFeeling.getFeeling();
			}

		}

		return probFeeling.getFeeling();
	}

	/**
	 * When the slavery threshold is exceeded,
	 * this function is called and return a new
	 * feeling given their probabilities
	 */
	public Class getPreviousFeeling() {
		Iterator<ProbabilityFeeling> it = previousFeelings.iterator();
		ProbabilityFeeling probFeeling = null;
		while(it.hasNext()) {

			probFeeling = it.next();
			if(Math.random() >= probFeeling.getProbability()) {
				return probFeeling.getFeeling();
			}

		}

		return probFeeling.getFeeling();
	}

};

/**
 * Class used to associate a
 * feeling with a probability
 */
class ProbabilityFeeling {

	/**
	 * Feeling for which there is
	 * a probability to be chosen
	 */
	protected Class feeling;

	/**
	 * Probability of the feeling
	 * to be chosen
	 */
	protected double probability;

	/**
	 * Constructor of the probability
	 * feeling class
	 */
	public ProbabilityFeeling(Class feeling, double probability) {
		this.feeling = feeling;
		this.probability = probability;
	}

	/**
	 * Getter for the feeling field
	 * @see #feeling
	 */
	public Class getFeeling() {
		return feeling;
	}

	/**
	 * Getter for the probability field
	 * @see #probability
	 */
	public double getProbability() {
		return probability;
	}

};
