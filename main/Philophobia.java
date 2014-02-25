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

		if(!options.isHelpQueried()) {
			Philophobia.window = new Window();
		} else {
	
			System.out.println("");
			System.out.println("Usage: philophobia [options]");
			System.out.println("");
			System.out.println("Options:");
			System.out.println("  Debugging options:");
			System.out.println("    -v                    Activate verbose mode (to be use multiple times for more verbosity)");
			System.out.println("    -h      --help        Print this help");
			System.out.println("");

		}
			
	}

	/**
	 * Getter for the verbose property
	 * @return The main class verbose static property
	 */
	public static Verbose getVerbose() {
		return verbose;
	}

};
