package main;

import java.util.Scanner;
import debug.CliOptions;
import debug.Verbose;

import window.Window;

/**
 * Main class
 */
public class Philophobia {

	/**
	 * Global variable used for debugging
	 * @see debug.Verbose
	 */
	private static Verbose verbose;

	/**
	 * Main window of the program
	 * @see window.Window
	 */
	private static Window window;

	/**
	 * Main function of the A3P program
	 * You can set options like verbose mode to the program
	 * @see debug.CliOptions
	 *
	 * @param args Global program options (see above)
	*/
	public static void main(String[] args) {
		
		CliOptions options = new CliOptions(args);

		Philophobia.verbose = new Verbose(options.getVerboseLevel());

		Philophobia.window = new Window();
			
	}

	/**
	 * Getter for the verbose property
	 * @return The main class verbose static property
	 */
	public static Verbose getVerbose() {
		return verbose;
	}

};
