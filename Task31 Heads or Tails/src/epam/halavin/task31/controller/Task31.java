package epam.halavin.task31.controller;

import epam.halavin.task31.view.util.Input;
import epam.halavin.task31.view.util.Output;
import epam.halavin.task31.model.GameHeadsOrTails;;

public class Task31 {

	public static void main(String[] args) {
		GameHeadsOrTails game = new GameHeadsOrTails();

		game.runGame();

		Output.logOutput("The heads's sum: " + game.getHeadsNumber() + " The tails's sum: " + game.getTailsNumber());

		game.runGame();

		Output.logOutput("The heads's sum: " + game.getHeadsNumber() + " The tails's sum: " + game.getTailsNumber());

	}

}
