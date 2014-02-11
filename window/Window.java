package	 window;

import javax.swing.JFrame;
import main.Philophobia;
import window.UI;

public class Window extends JFrame {

	/**
	 * User interface which handle the graphics inside the window
	 * @see window.UI
	 */
	private UI userInterface;

	/**
	 * Constructor of the Window class
	 */
	public Window() {
		Philophobia.getVerbose().calls("Creating Window class", "org/window/Window.java", "Window.Window()");

		this.setTitle("Philophobia");
		this.setSize(600,500);
		
		// Fullscreen mode
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);

		userInterface = new UI();
		this.setContentPane(userInterface);
	}

};
