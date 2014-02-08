package debug;

import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.io.IOException;

/**
 * Class used to display and log messages all over this program
 */
public class Verbose {

	/**
	 * Level of verbosing, from 0 to 5
	 * <p>
	 * The number of information displayed and logged goes increasingly as the number increase
	 * - Level 1 : Only critical errors and exeptions are displayed on the console
	 * - Level 2 : Serious but not critical errors and level 1 displayed
	 * - Level 3 : Warning and level 2 displayed
	 * - Level 4 : Informations and level 3 displayed
	 * - Level 5 : Everything, included Class instanciations and function calls and level 4 displayed
	 */
	private int verboseMode = 0;
	
	/**
	 * Logger used to log messages into a file
	 */
	Logger log;

	/**
	 * Class constructor
	 * 
	 * @param level Level of "verbosing"
	 * @see verboseMode
	 */
	public Verbose(int level) {
		this.verboseMode = level;

		if(level > 0) {
			System.out.println("Verbose mode activated at level " + level);
			
				log = Logger.getLogger("Philophobia.log");
				
				try {
					log.addHandler(new FileHandler("Philophobia.log"));
				} catch (IOException e) {
					warning("Error initializing the log file", "org/debug/Verbose.java", "Verbose.Verbose(int)");
				}

				log.setLevel(Level.parse("ALL"));

				log.info("Verbose at level " + level + ".");
				log.info("Displayed messages are :");
				log.info("- Criticals");

				if(level >= 2) {
					log.info("- Serious");
				}
				if(level >= 3) {
					log.info("- Warnings");
				}
				if(level >= 4) {
					log.info("- Informations");
				}
				if(level >= 5) {
					log.info("- Class instanciations and function calls");
				}
		}

		this.calls("Verbose class created", "org/debug/Verbose.java", "Verbose.Verbose(int)");
	}

	/**
	 * Display and log a message with additionnal informations in the log file
	 * The message is displayed and logged if and only if the verbose level is greater or equal to 1
	 *
	 * @param message Message content
	 * @param file File in which this function is called
	 * @param location Class and function in which this function is called
	 */
	public void critical(String message, String file, String location) {
		if(verboseMode >= 1) {
			System.out.println("Critical : " + message);

//			try {
				log.severe("Critical : " + message + " in file " + file + " in " + location);
/*			} catch(IOException e) {
				warning("Unable to write in log file", "org/debug/Verbose.java", "Verbose.critical(String, String, String)");
			}*/
		}
	}

	/**
	 * Display and log a message with additionnal informations in the log file
	 * The message is displayed and logged if and only if the verbose level is greater or equal to 2
	 *
	 * @param message Message content
	 * @param file File in which this function is called
     * @param location Class and function in which this function is called
	 */
	public void serious(String message, String file, String location) {
		if(verboseMode >= 2) {
			System.out.println("Serious : " + message);
			
//			try {
				log.severe("Serious : " + message + " in file " + file + " in " + location);
/*			} catch(IOException e) {
				warning("Unable to write in log file", "org/debug/Verbose.java", "Verbose.serious(String, String, String)");
			}*/
		}
	}
	
	/**
	 * Display and log a message with additionnal informations in the log file
	 * The message is displayed and logged if and only if the verbose level is greater or equal to 3
	 *
	 * @param message Message content
	 * @param file File in which this function is called
     * @param location Class and function in which this function is called
	 */
	public void warning(String message, String file, String location) {
		if(verboseMode >= 3) {
			System.out.println("Warning : " + message);
			
//			try {
				log.warning("Warning : " + message + " in file " + file + " in " + location);
/*			} catch(IOException e) {
				// Not warning in order to prevent from infinite loop
				System.out.println("Unable to write in log file in file org/debug/Verbose.java in Verbose.warning(String, String, String)");
			}*/
		}
	}
	
	/**
	 * Display and log a message with additionnal informations in the log file
	 * The message is displayed and logged if and only if the verbose level is greater or equal to 4
	 *
	 * @param message Message content
	 * @param file File in which this function is called
     * @param location Class and function in which this function is called
	 */
	public void information(String message, String file, String location) {
		if(verboseMode >= 4) {
			System.out.println("Information : " + message);
			
//			try {
				log.info("Information : " + message + " in file " + file + " in " + location);
/*			} catch(IOException e) {
				warning("Unable to write in log file", "org/debug/Verbose.java", "Verbose.information(String, String, String)");
			}*/
		}
	}
	
	/**
	 * Display and log a message with additionnal informations in the log file
	 * The message is displayed and logged if and only if the verbose level is equal to 5
	 *
	 * @param message Message content
	 * @param file File in which this function is called
     * @param location Class and function in which this function is called
	 */
	public void calls(String message, String file, String location) {
		if(verboseMode >= 5) {
			System.out.println("Calls : " + message);
			
//			try {
				log.finer("Calls : " + message + " in file " + file + " in " + location);
/*			} catch(IOException e) {
				warning("Unable to write in log file", "org/debug/Verbose.java", "Verbose.calls(String, String, String)");
			}*/
		}
	}
};
