package gameplay.ai.phrasing;

import main.Philophobia;
import gameplay.ai.phrasing.OrderedPhrases;

public class Phrasing {

	/**
	 * Attribute containing the phrases for the
	 * curiosity Feeling
	 */
	protected OrderedPhrases curiosityPhrases;

	/**
	 * Attribute containing the phrases for the
	 * anger Feeling
	 */
	protected OrderedPhrases angerPhrases;

	/**
	 * Attribute containing the phrases for the
	 * depression Feeling
	 */
	protected OrderedPhrases depressionPhrases;

	/**
	 * Attribute containing the phrases for the
	 * power complex Feeling
	 */
	protected OrderedPhrases powerComplexPhrases;

	/**
	 * Phrasing class constructor
	 */
	public Phrasing() {
		Philophobia.getVerbose().calls("Creating Phrasing class", "gameplay/ai/phrasing/Phrasing.java", "Phrasing.Phrasing()");

		curiosityPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "curiosity.phrases");
		angerPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "anger.phrases");
		depressionPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "depression.phrases");
		powerComplexPhrases = new OrderedPhrases(Philophobia.getPhrasesFilePrefix() + "powercomplex.phrases");

	}

};
