package world.character;

import main.Philophobia;
import world.scenery.Scenery;
import world.InteractiveObject;

/**
 * Class used to handle a character (player or non-player)
 * <p>
 * A character can be a purely decorative character
 * or a talking character or a player character (the hero)
 */
abstract public class Character extends Scenery implements InteractiveObject {

	/**
	 * Height of the character's image (fixed)
	 */
	protected static final int CHARACTER_HEIGHT = 300;

	/**
	 * Width of the character's image (fixed)
	 */
	protected static final int CHARACTER_WIDTH = 170;

	/**
	 * Horizontal position of the character
	 */
	protected int posX;

	/**
	 * Vertical position of the character
	 */
	protected int posY;

	/**
	 * Character class constructor
	 * @param image Image filename representing the character
	 */
	public Character(final String imagePath) {
		Philophobia.getVerbose().calls("Character class created", "world/characters/Character.java", "Character.Character(String)");

		super(image, CHARACTER_HEIGHT, CHARACTER_WIDTH);

	}

	/**
	 * Teleport the character horizontally regarding his current position
	 * @param distance Horizontal distance toward the character will be teleported
	 */
	public void jumpX(int distance) {
		if(distance != 0) {
			this.posX = this.posX + distance;
			this.draw();
		}
	}

	/**
	 * Teleport the character vertically regarding his current position
	 * @param distance Vertical distance toward the character will be teleported
	 */
	public void jumpY(int distance) {
		if(distance != 0) {
			this.posY = this.posY + distance;
			this.draw();
		}
	}

	/**
	 * Teleport the character regarding his current position
	 * @param distanceX Horizontal distance toward the character will be teleported
	 * @param distanceY Vertical distance toward the character will be teleported
	 */
	public void jump(int distanceX, int distanceY) {
		if(distanceX != 0 || distanceY != 0) {
			this.posX = this.posX + distance;
			this.posY = this.posY + distance;
			this.draw();
		}
	}

	/**
	 * Slowly horizontally move the character to a certain point regarding his current position
	 * @param distance Horizontal distance toward the character will be moved
	 */
	public void moveX(int distance) {
		
		if(distance != 0) {
			int step = (distance < 0)? -1 : 1; 

			this.jumpX(step);

			this.moveX(distance - step);
		}

	}

	/**
	 * Slowly vertically move the character to a certain point regarding his current position
	 * @param distance Vertical distance toward the character will be moved
	 */
	public void moveY(int distance) {

		if(distance != 0) {
			int step = (distance < 0)? -1 : 1;

			this.jumpY(step);

			this.moveY(distance - step);
		}

	}

	/**
	 * Slowly move the character to a certain point regarding his current position
	 * @param distanceX Horizontal distance toward the character will be moved
	 * @param distanceY Vertical distance toward the character will be moved
	 */
	public void move(int distanceX, int distanceY) {
		
		if(distanceX != 0 || distanceY != 0) {
			int stepX = (distanceX < 0)? -1 : 1;
			int stepY = (distanceY < 0)? -1 : 1;

			this.jump(stepX, stepY);

			if(distanceX - stepX == 0) {
				moveY(distanceY - stepY);
				return;
			}

			if(distanceY - stepY == 0) {
				moveX(distanceX - stepX);
				return;
			}

			move(distanceX - stepX, distanceY - stepY);
		}

	}

	// ===============================
	// == InteractiveObject methods ==
	// ===============================
	
	public void triggerAction() {

	}

	public void playerNear() {

	}

	public void playerEnter() {

	}

	public void playerLeave() {

	}

	public boolean isTraversable() {
		return false;
	}


	
};
