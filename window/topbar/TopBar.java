package window.topbar;

import main.Philophobia;
import window.topbar.TopBarButton;

import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Dimension;

/**
 * Class handling the top bar of the program's main window
 */
public class TopBar extends JPanel {
	
	/**
	 * Height of the UI's top bar (default: 42px)
	 */
	protected static int TOPBAR_HEIGHT = 42;

	/**
	 * Margin of the top bar (default: 10px)
	 */
	protected static int TOPBAR_MARGIN = 10;

	/**
	 * Button closing the program when activated
	 */
	protected TopBarButton closeButton;

	/**
	 * Button pausing the program when activated
	 */
	protected TopBarButton pauseButton;

	/**
	 * Constructor of the TopBar class
	 */
	public TopBar() {

		super();

		Philophobia.getVerbose().calls("Creating TopBar class", "window/topbar/TopBar.java", "TopBar.TopBar()");

		this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		this.add(Box.createHorizontalGlue());

		closeButton = new TopBarButton("images/closebutton.png");
		closeButton.setPreferredSize(new Dimension(TOPBAR_HEIGHT - TOPBAR_MARGIN, TOPBAR_HEIGHT - TOPBAR_MARGIN));
		closeButton.setMinimumSize(new Dimension(TOPBAR_HEIGHT - TOPBAR_MARGIN, TOPBAR_HEIGHT - TOPBAR_MARGIN));
		closeButton.setMaximumSize(new Dimension(TOPBAR_HEIGHT - TOPBAR_MARGIN, TOPBAR_HEIGHT - TOPBAR_MARGIN));

		pauseButton = new TopBarButton("images/pausebutton.png");
		pauseButton.setPreferredSize(new Dimension(TOPBAR_HEIGHT - TOPBAR_MARGIN, TOPBAR_HEIGHT - TOPBAR_MARGIN));
		pauseButton.setMinimumSize(new Dimension(TOPBAR_HEIGHT - TOPBAR_MARGIN, TOPBAR_HEIGHT - TOPBAR_MARGIN));
		pauseButton.setMaximumSize(new Dimension(TOPBAR_HEIGHT - TOPBAR_MARGIN, TOPBAR_HEIGHT - TOPBAR_MARGIN));

		this.add(pauseButton);
		this.add(Box.createRigidArea(new Dimension(TOPBAR_MARGIN, 0)));
		this.add(closeButton);
	}

	public static int getTopBarHeight() {
		return TOPBAR_HEIGHT;
	}

	public static int getTopBarMargin() {
		return TOPBAR_MARGIN;
	}

};
