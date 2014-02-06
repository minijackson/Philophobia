package org.debug;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Class used to analyze the commands passed to the program
 * <p>
 * For now, only the verbose "-v" can be passed to the program (once or several times)
 * <p>
 * You can set a level of verbose mode from 0 to 5, you just have to put -v for verbose mode level 1, -vv for level 2 and so on
 */
public class CliOptions {
	
	private int verboseLevel;


	/**
	 * Constructor of the CliOption
	 */
	public CliOptions(String[] args) {

		String oneDashOptions = new String();     // One dash options are letter by letter
		List<String> twoDashesOptions = new LinkedList<String>(); // That is not the case with two dashes options which are word by word

		// Check the arguments passed to the program
		for(String str : args) {
			// Check if an option is set
			if(str.charAt(0) == '-' && str.length() > 1) {

				// This program support the fact that an option can be prfixed with either '-' or '--'
				if(str.charAt(1) == '-' && str.length() > 2) {
					
					twoDashesOptions.add(str.substring(2));

				} else {
					
					oneDashOptions += str.substring(1);

				}
				
				
			}
		}

		checkVerboseLevel(oneDashOptions);

	}

	/**
	 * Check the verbose level considering the options with one dash
	 * @param args The options with one dash passed to the program
	 */
	private void checkVerboseLevel(String args) {
		verboseLevel = 0;
		
		// Due to performance reasons, the length of the arguments are stored in a variable
		int argsLength = args.length();

		for(int i = 0 ; i < argsLength && verboseLevel < 5 ; ++i) {
			if(args.charAt(i) == 'v')
				++verboseLevel;
		}

	}

	/**
	 * Return the verbose level passed as options to the program
	 * @return The verbose level
	 */
	public int getVerboseLevel() {
		return verboseLevel;
	}

};
