
public class MoodEmulator {
	static final int UPPERLIMIT = 10;
	static final int LOWERLIMIT = 0;

	public String emulateFace() {
		int theFaceID = LOWERLIMIT + (int) (Math.random() * UPPERLIMIT);

		switch (theFaceID) {
		case 0:
			return "twisted";
		case 1:
			return "tired";
		case 2:
			return "peaceful";
		case 3:
			return "charming";
		case 4:
			return "calm";
		case 5:
			return "surprised";
		case 6:
			return "angry";
		case 7:
			return "funny";
		case 8:
			return "sad";
		default:
			return "vague";
		}
	}
}
