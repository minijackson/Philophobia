package world.character;

import main.Philophobia;
import world.character.Character;

/**
 * Class handling a talking character
 */
public class TalkingCharacter extends Character {

	/**
	 * TalkingCharacter constructor
	 * @param imagePath Path of the image representing the character
	 */
	public TalkingCharacter(final String imagePath) {
		super(imagePath);
	}

	/**
	 * Method making the character talk
	 */
	public void talk() {

	}

	// ===============================
	// == InteractiveObject methods ==
	// ===============================
	
	public void triggerAction() {
		talk();
	}
};
