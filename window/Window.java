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
	 * Window's current state
	 * @see window.WindowState
	 */
	protected WindowState windowState;

	/**
	 * Window top bar
	 */
	protected TopBar topbar;

	/**
	 * User interface which handle the game graphics inside the window
	 */
	protected UI userInterface;

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

		windowState = WindowState.FirstLoading;

		userInterface = new UI(this.getHeight(), this.getWidth());
//		this.getContentPane().add(userInterface, BorderLayout.CENTER);

		topbar = new TopBar();
		this.getContentPane().add(topbar, BorderLayout.PAGE_START);
		this.pack();
		this.setVisible(true);

	}

	public void setLoadingState() {
		Philophobia.getVerbose().information("Setting window's Loading mode", "window/Window.java", "Window.setLoadingState()");
		topbar.hidePauseButton();
		windowState = WindowState.LoadingScreen;
	}

	public void setGameState() {
		Philophobia.getVerbose().information("Setting window's Game mode", "window/Window.java", "Window.setGameState()");
		topbar.showPauseButton();
		this.getContentPane().add(userInterface, BorderLayout.CENTER);
		windowState = WindowState.Game;
	}

	public void setFailState() {
		Philophobia.getVerbose().information("Setting window's Fail mode", "window/Window.java", "Window.setFailState()");
		topbar.hidePauseButton();
		windowState = WindowState.Fail;
	}

	public void setWinState() {
		Philophobia.getVerbose().information("Setting window's Win mode", "window/Window.java", "Window.setWindState()");
		topbar.hidePauseButton();
		windowState = WindowState.Win;
	}

	public UI getUserInterface() {
		return userInterface;
	}

};

/**
 * Enumeration of the possible states of the displayed graphics
 * <p>
 * The state can be the "in game" state, a loading screen,
 * the "win" or "fail" screen
 * @see Window
 * @see #FirstLoading
 * @see #Game
 * @see #LoadingScreen
 * @see #Win
 * @see #Fail
 */
enum WindowState {

	/**
	 * The FirstLoading state correspond to
	 * the state where the window has just
	 * been called and a special animation
	 * is displayed
	 */
	FirstLoading,

	/**
	 * The Game state correspond to the state
	 * in which the player is playing the game
	 */
	Game,

	/**
	 * The LoadingScreen state correspond to
	 * the state where a loading animation
	 * is displayed
	 */
	LoadingScreen,

	/**
	 * The Win state correspond to the state
	 * where the player has won the game and
	 * a congratulation screen is displayed
	 */
	Win,

	/**
	 * The Fail state correspond to the state
	 * where the player has lost the game
	 * and a condolence screen is displayed
	 */
	Fail

};
