package	 org.window;

import javax.swing.JFrame;
import org.window.UI;

public class Window extends JFrame {

	private UI userInterface;

	public Window() {
		this.setTitle("Philophobia");
		this.setSize(600,500);

		userInterface = new UI();
	}

};
