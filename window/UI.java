package window;

import main.Philophobia;
import world.World;

import java.awt.Graphics;
import javax.swing.JPanel;

public class UI extends JPanel {

	public void paintComponent(Graphics g) {
		g.fillOval(20, 20, 75, 75);

		Philophobia.getVerbose().calls("painting components", "org/window/UI.java", "UI.paintComponent(Graphics)");
	}

};
