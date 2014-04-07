package world.character;

import main.Philophobia;
import world.character.Character;

/**
 * Class handling the main playing Character
 */
public class Hero extends Character {

	/**
	 * Hero class constructor
	 */
	public Hero() {
		super(Philophobia.getImageFilePrefix() + "hero.png");
		Philophobia.getVerbose().information("Created Hero class", "world/character/Hero.java", "Hero.Hero()");
	}

};
