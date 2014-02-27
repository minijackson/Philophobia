package window.topbar;

import main.Philophobia;
import window.topbar.TopBar;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;

import javax.swing.JButton;

/**
 * Class handling the UI buttons 
 */
class TopBarButton extends JButton {

	/**
	 * Image of the graphical representation of the button
	 */
	protected Image buttonImage;

	/**
	 * UIButton constructor
	 * @param imagePath path of the button's image
	 * @see #buttonImage
	 */
	public TopBarButton(String imagePath) {

		super();

		Philophobia.getVerbose().calls("Creating TopBarButton class", "window/ui/TopBarButton.java", "TopBarButton.TopBarButton(String)");

		try {
			buttonImage = ImageIO.read(new File(imagePath));
			this.setIcon(new ImageIcon(buttonImage));
		} catch(IOException e) {
			Philophobia.getVerbose().warning("Button image load failed: " + e.getMessage(), "window/ui/TopBarButton.java", "TopBarButton.TopBarButton(String)");
			buttonImage = null;
		}

	}

	public void paintComponent(Graphics g) {

		Philophobia.getVerbose().calls("painting TopBarButton component", "window/ui/TopBarButton.java", "TopBarButton.paintComponent(Graphics)");

		int buttonSize = TopBar.getTopBarHeight() - TopBar.getTopBarMargin();

 		g.drawImage(buttonImage, 0, 0, this.getWidth(), this.getHeight(), this);
	}

};
