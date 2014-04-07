/**
 * \package gameplay.ai.phrasing
 * Package handling the talk system for the AI.
 */
package gameplay.ai.phrasing;

import main.Philophobia;
import gameplay.ai.phrasing.OrderedPhrases;

/**
 * Class handling the talk system for the AI
 * <p>
 * It contains a several number of phrases
 * corresponding to each feeling, ordered
 * corresponding to when the phrase were
 * last said by the AI
 */
public class Phrasing {

	/**
	 * Attribute containing the AI phrases for the
	 * curiosity Feeling that aims to motivate
	 * the player to do some actions
	 */
	protected OrderedPhrases curiosityMotivationPhrases;

	/**
	 * Attribute containing the AI phrases for the
	 * curiosity Feeling that are said when the
	 * player refused to do the asked action
	 */
	protected OrderedPhrases curiosityBetrayalPhrases;

	/**
	 * Attribute containing the AI phrases for the
	 * curiosity Feeling that are said when the
	 * player did the asked action
	 */
	protected OrderedPhrases curiositySlaveryPhrases;

	/**
	 * Attribute containing the AI phrases for the
	 * anger Feeling that aims to motivate
	 * the player to do some actions
	 */
	protected OrderedPhrases angerMotivationPhrases;

	/**
	 * Attribute containing the AI phrases for the
	 * anger Feeling that are said when the
	 * player refused to do the asked action
	 */
	protected OrderedPhrases angerBetrayalPhrases;

	/**
	 * Attribute containing the AI phrases for the
	 * anger Feeling that are said when the
	 * player did the asked action
	 */
	protected OrderedPhrases angerSlaveryPhrases;

	/**
	 * Attribute containing the AI phrases for the
	 * depression Feeling that aims to motivate
	 * the player to do some actions
	 */
	protected OrderedPhrases depressionMotivationPhrases;

	/**
	 * Attribute containing the AI phrases for the
	 * depression Feeling that are said when the
	 * player refused to do the asked action
	 */
	protected OrderedPhrases depressionBetrayalPhrases;

	/**
	 * Attribute containing the AI phrases for the
	 * depression Feeling that are said when the
	 * player did the asked action
	 */
	protected OrderedPhrases depressionSlaveryPhrases;

	/**
	 * Attribute containing the AI phrases for the
	 * power complex Feeling that aims to motivate
	 * the player to do some actions
	 */
	protected OrderedPhrases powerComplexMotivationPhrases;

	/**
	 * Attribute containing the AI phrases for the
	 * power complex Feeling that are said when the
	 * player refused to do the asked action
	 */
	protected OrderedPhrases powerComplexBetrayalPhrases;

	/**
	 * Attribute containing the AI phrases for the
	 * power complex Feeling that are said when the
	 * player did the asked action
	 */
	protected OrderedPhrases powerComplexSlaveryPhrases;

	/**
	 * Field containing the asked action in a
	 * human readable format
	 */
	protected String actionAsked;

	/**
	 * Phrasing class constructor
	 */
	public Phrasing() {
		Philophobia.getVerbose().calls("Creating Phrasing class", "gameplay/ai/phrasing/Phrasing.java", "Phrasing.Phrasing()");

		curiosityMotivationPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "curiositymotivation.phrases");
		curiosityBetrayalPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "curiositybetrayal.phrases");
		curiositySlaveryPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "curiosityslavery.phrases");
		
		angerMotivationPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "angermotivation.phrases");
		angerBetrayalPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "angerbetrayal.phrases");
		angerSlaveryPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "angerslavery.phrases");

		depressionMotivationPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "depressionmotivation.phrases");
		depressionBetrayalPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "depressionbetrayal.phrases");
		depressionSlaveryPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "depressionslavery.phrases");

		powerComplexMotivationPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "powercomplexmotivation.phrases");
		powerComplexBetrayalPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "powercomplexbetrayal.phrases");
		powerComplexSlaveryPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "powercomplexslavery.phrases");

	}

};
