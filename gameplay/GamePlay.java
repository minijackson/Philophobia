package gameplay;

import main.Philophobia;
import debug.CliOptions;
import window.Window;
import world.World;
import gameplay.ai.AI;

/**
 * Class handling the game play of this game
 * <p>
 * It handle the creation of worlds, the movements
 * of the main character and all the other characters,
 * (including the constraints), the interactions between
 * the main character and the other characters or the
 * scenery
 * <p>
 * The GamePlay class also controls the user interface mode
 * (loading screen, win, fail, etc…)
 * <p>
 * This class is the equivalent of the controller in the
 * MVC paradigm.
 * @see world.World
 */
public class GamePlay {

	/**
	 * World currently being played
	 */
	protected World currentWorld;

	/**
	 * Name of the world currently being played
	 * <p>
	 * It is used to detect in which world the
	 * player is and where are the other worlds
	 */
	protected String currentWorldName;

	/**
	 * The game window
	 */
	protected Window window;

	/**
	 * Malicious artificial intelligence
	 * driving the player mad
	 */
	protected AI artificialIntelligence;

	/**
	 * Constructor of the GamePlay class
	 * @param cliOptions Opions for the game given via the command line
	 */
	public GamePlay(CliOptions cliOptions) {
		Philophobia.getVerbose().information("Creating GamePlay class", "gameplay/Gameplay.java", "GamePlay.GamePlay()");

		// The default world is the Temperate Broadleaf world
		currentWorldName = "Temperate Broadleaf";
		currentWorld = new World("temperatebroadleaf");

		window = new Window();

		try {
			// Sleep during the length of the animation
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			Philophobia.getVerbose().warning("Sleep interrupted: " + e.getMessage(), "gameplay/GamePlay.java", "GamePlay.GamePlay(CliOptions)");
		}

		artificialIntelligence = new AI(currentWorld);

		window.getUserInterface().setDisplayedWorld(currentWorld);
		window.setGameState();
	}

};
