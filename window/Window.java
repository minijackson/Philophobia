package	 window;

import main.Philophobia;
import window.UI;

import javax.swing.JFrame;

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
//		this.setSize(600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Fullscreen mode
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);

		userInterface = new UI(this.getHeight(), this.getWidth());
		this.setContentPane(userInterface);

		this.setVisible(true);
	}

};
