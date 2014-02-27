package	 window;

import main.Philophobia;
import window.ui.UI;
import window.topbar.TopBar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.BorderLayout;

public class Window extends JFrame {

	/**
	 * User interface which handle the game graphics inside the window
	 * @see window.ui.UI
	 */
	private UI userInterface;

	private TopBar topbar;

	/**
	 * Constructor of the Window class
	 */
	public Window() {
		Philophobia.getVerbose().calls("Creating Window class", "window/Window.java", "Window.Window()");

		this.setTitle("Philophobia");
		this.setSize(((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth()), ((int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Fullscreen mode
		this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);

		this.setLayout(new BorderLayout());
	
		userInterface = new UI(this.getHeight(), this.getWidth());
		this.getContentPane().add(userInterface, BorderLayout.CENTER);

		TopBar topbar = new TopBar();
		this.getContentPane().add(topbar, BorderLayout.PAGE_START);

/*
		this.setContentPane(userInterface);
*/
		this.pack();
		this.setVisible(true);

	}

};
