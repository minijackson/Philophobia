package main;

import java.util.Scanner;
import debug.CliOptions;
import debug.Verbose;

import gameplay.GamePlay;

/**
 * Main class
 */
public class Philophobia {

	/**
	 * Directory containing all the image files
	 */
	protected static String IMAGE_FILE_PREFIX = "src/images/";

	/**
	 * Directory containing all the world files
	 */
	protected static String WORLD_FILE_PREFIX = "src/world/";

	/**
	 * Directory containing all the phrases files
	 */
	protected static String PHRASES_FILE_PREFIX = "src/phrases/";

	/**
	 * Global variable used for debugging
	 */
	protected static Verbose verbose;
/*
	/**
	 * Main window of the program
	 */
//	private static Window window;

	/**
	 * Game handler
	 */
	protected static GamePlay gamePlay;

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
			// Philophobia.window = new Window();
			Philophobia.gamePlay = new GamePlay(options);
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
	 * Getter for the verbose field
	 * @return The main class verbose static property
	 */
	public static Verbose getVerbose() {
		return verbose;
	}

	/**
	 * Getter for the IMAGE_FILE_PREFIX field
	 * @see #IMAGE_FILE_PREFIX
	 */
	public static String getImageFilePrefix() {
		return IMAGE_FILE_PREFIX;
	}

	/**
	 * Getter for the WORLD_FILE_PREFIX field
	 * @see #WORLD_FILE_PREFIX
	 */
	public static String getWorldFilePrefix() {
		return WORLD_FILE_PREFIX;
	}

	public static String getPhrasesFilePrefix() {
		return PHRASES_FILE_PREFIX;
	}

};
