package debug;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Class used to analyze the commands passed to the program
 * <p>
 * For now, the verbose "-v" can be passed
 * to the program (once or several times)
 * and the help (containing the list of
 * options available) can be queried via --help or -h
 * <p>
 * You can set a level of verbose mode from 0 to 5,
 * you just have to put -v for verbose mode level 1, -vv for level 2 and so on
 */
public class CliOptions {

	/**
	 * Level of verbosing detected due to the args passed to the program
	 *
	 * @see Verbose
	 * @see Verbose#verboseMode
	 */
	protected int verboseLevel;

	/**
	 * Field equal to true if the help has been queried, false if not
	 * <p>
	 * If the help has been queried, then the game doesn't launch but
	 * instead print all the options that can be passed to the program
	 */
	protected boolean helpQueried;

	/**
	 * One letter options passed to the program
	 * (corresponding to "one dash" options)
	 */
	protected String oneDashOptions;

	/**
	 * List of two dashes options passed to the program
	 */
	protected List<String> twoDashesOptions;

	/**
	 * Constructor of the CliOption
	 *
	 * @param args Options passed to the program when launching it
	 */
	public CliOptions(String[] args) {

		oneDashOptions = new String();
		twoDashesOptions = new LinkedList<String>();

		verboseLevel = 0;
		helpQueried = false;

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

		checkVerboseLevel();
		checkHelp();

	}

	/**
	 * Check the verbose level considering the options with one dash
	 * @see #verboseLevel
	 */
	protected void checkVerboseLevel() {
		verboseLevel = 0;
		
		// Due to performance reasons, the length of the arguments are stored in a variable
		int oneDashOptionsLength = oneDashOptions.length();

		for(int i = 0 ; i < oneDashOptionsLength && verboseLevel < 5 ; ++i) {
			if(oneDashOptions.charAt(i) == 'v')
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

	/**
	 * Chech if the help mode has been queried considering the options with on or two dashes
	 * @see #helpQueried
	 */
	protected void checkHelp() {

		helpQueried = false;

		int oneDashOptionsLength = oneDashOptions.length();

		for(int i = 0 ; i < oneDashOptionsLength ; ++i) {
			if(oneDashOptions.charAt(i) == 'h') {
				helpQueried = true;
				return;
			}
		}

		ListIterator li = twoDashesOptions.listIterator();

		while(li.hasNext()) {
			if(li.next().equals("help")) {
				helpQueried = true;
				return;
			}
		}

	}

	/**
	 * Return true if the help has been queried or false if not
	 * @return the helpQueried field
	 */
	public boolean isHelpQueried() {
		return helpQueried;
	}


};
