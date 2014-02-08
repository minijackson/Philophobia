package main;

import java.util.Scanner;
import debug.CliOptions;
import debug.Verbose;

/**
 * Main class
 */
public class Philophobia {

	/**
	 * Global variable used for debugging
	 * @see org.debug.Verbose
	 */
	private static Verbose verbose;

	/**
	 * Main function of the A3P program
	 * You can set options like verbose mode to the program
	 * @see org.debug.CliOptions
	 *
	 * @param args Global program options (see above)
	*/
	public static void main(String[] args) {
		
		CliOptions options = new CliOptions(args);

		Philophobia.verbose = new Verbose(options.getVerboseLevel());
			
	}

	public static Verbose getVerbose() {
		return verbose;
	}

};
