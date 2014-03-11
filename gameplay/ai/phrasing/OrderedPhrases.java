package gameplay.ai.phrasing;

import main.Philophobia;

import java.io.File;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Class used to contain an ordered list of phrases
 * <p>
 * It is ordered according to the last phrases that
 * were spoken by the AI
 * <p>
 * The last phrases that were spoken by the AI are pushed
 * at the bottom of the list
 */
public class OrderedPhrases {

	/**
	 * Array containing all the phrases
	 * corresponding to the current feeling
	 * and/or action
	 */
	protected String[] phrases;

	/**
	 * Order of the phrases array field
	 * @see #phrases
	 */
	protected int[] phrasesOrder;

	/**
	 * OrderedPhrases class constructor
	 * @param filename Path and name of the file contaning line by line the phrases
	 */
	public OrderedPhrases(final String filename) {
		Philophobia.getVerbose().calls("Creating new OrderedPhrases class", "gameplay/ai/phrasing/OrderedPhrases.java", "OrderedPhrases.OrderedPhrases(String)");

		int phrasesLength = getPhrasesNumber(filename);

		phrases = new String[phrasesLength];
		phrasesOrder = new int[phrasesLength];

		try {
			RandomAccessFile raFile = new RandomAccessFile(new File(filename), "r");

			String currentLine = raFile.readLine();
			for(int i = 0 ; currentLine != null ; ++i) {
				phrases[i] = currentLine;
				currentLine = raFile.readLine();
			}
		} catch(FileNotFoundException e) {
			Philophobia.getVerbose().serious("File not found exception: " + e.getMessage(), "gameplay/ai/phrasing/OrderedPhrases.java", "OrderedPhrases.OrderedPhrases(String)");
		} catch(IOException e) {
			Philophobia.getVerbose().serious("IO exception: " + e.getMessage(), "gameplay/ai/phrasing/OrderedPhrases.java", "OrderedPhrases.OrderedPhrases(String)");
		}
	}

	/**
	 * Method counting the number of line in filename
	 * @param filename Path and name of the file
	 * @return The number of phrases une the file or 0 if there is no phrases or an error
	 */
	protected int getPhrasesNumber(final String filename) {

		try {
			// Opening filename i read mode 
			RandomAccessFile raFile = new RandomAccessFile(new File(filename), "r");

			// Count the number of lines
			int i;
			for(i=0 ; raFile.readLine() != null ; ++i);
			return i;
		} catch(FileNotFoundException e) {
			Philophobia.getVerbose().serious("File not found exception: " + e.getMessage(), "gameplay/ai/phrasing/OrderedPhrases.java", "OrderedPhrases.OrderedPhrases(String)");
		} catch(IOException e) {
			Philophobia.getVerbose().serious("IO exception: " + e.getMessage(), "gameplay/ai/phrasing/OrderedPhrases.java", "OrderedPhrases.OrderedPhrases(String)");
		}
		return 0;
	}

};
