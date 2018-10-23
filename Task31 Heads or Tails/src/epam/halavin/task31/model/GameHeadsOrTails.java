package epam.halavin.task31.model;

public class GameHeadsOrTails {
	private boolean wasStarted;
	private int headsNumber;
	private int tailsNumber;

	public boolean wasGameStarted() {
		if (wasStarted) {
			return true;
		}

		return false;
	}

	public void runGame() {
		wasStarted = true;
		headsNumber = 0;
		tailsNumber = 0;

		for (int i = 0; i < 1000; i++) {
			if (Math.round(Math.random()) == 0) {
				headsNumber++;
			} else {
				tailsNumber++;
			}
		}

	}

	public int getHeadsNumber() {
		if (wasStarted) {
			return headsNumber;
		}
		System.out.println("First, you should start the game.\n");

		return 0;
	}

	public int getTailsNumber() {
		if (wasStarted) {
			return tailsNumber;
		}
		System.out.println("First, you should start the game.\n");

		return 0;
	}
}
