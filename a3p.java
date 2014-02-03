import java.util.Scanner;
import org.debug.Verbose;

public class a3p {
	/**
	 * Main function of the A3P program
	 * You can set a level of verbose mode from 0 to 5, you just have to put -v for verbose mode level 1, -vv for level 2 and so on
	 * @see org.debug.Verbose
	 *
	 * @param args Global program options (see above)
	*/
	public static void main(String[] args) {
		
		int verboseMode = 0;

		// Check the arguments passed to the program
		for(String str : args) {
			// Check if an option is set
			if(str.charAt(0) == '-' && str.length() > 1) {

				// This program support the fact that an option can be prfixed with either '-' or '--'
				int substrStartIndex = (str.charAt(1) == '-' && str.length() > 2) ? 2 : 1;
				String cliOption = str.substring(substrStartIndex);
				
				// Due to performance reasons, the length of the String is stored so the .length() function is called only once
				int cliOptionLength = cliOption.length();
				for(int i = 0 ; i < cliOptionLength && cliOption.charAt(i) == 'v' ; ++i) {
					++verboseMode; // Count the number of 'v' for verbose mode
				}

			}
		}

		verboseMode = (verboseMode > 5) ? 5 : verboseMode; // Maximal verbose mode = 5

		Verbose verbose = new Verbose(verboseMode);

		Scanner sc = new Scanner(System.in);
		
		// println = print + \n
		System.out.println("Hello World !");
		System.out.println("Qui êtes-vous ?");

		String pseudo = sc.nextLine();

		System.out.println("Vous vous appellez " + pseudo);
		
		verbose.closeFile();
	}
};
