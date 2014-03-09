package world.character;

import main.Philophobia;
import world.character.Character;

public class Hero implements Character {

	public Hero() {
		super(Philophobia.getImageFilePrefix() + "hero.png");
		Philophobia.getVerbose().information("Created Hero class", "world/character/Hero.java", "Hero.Hero()");
	}

};
