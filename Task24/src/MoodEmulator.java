
public class MoodEmulator {
	static final int UPPERLIMIT = 10;
	static final int LOWERLIMIT = 0;

	public String emulateFace() {
		int theFaceID = LOWERLIMIT + (int) (Math.random() * UPPERLIMIT);
		String theFace = "";

		switch (theFaceID) {
		case 0:
			theFace = "twisted";
			break;
		case 1:
			theFace = "tired";
			break;
		case 2:
			theFace = "peaceful";
			break;
		case 3:
			theFace = "charming";
			break;
		case 4:
			theFace = "calm";
			break;
		case 5:
			theFace = "surprised";
			break;
		case 6:
			theFace = "angry";
			break;
		case 7:
			theFace = "funny";
			break;
		case 8:
			theFace = "sad";
			break;
		default:
			theFace = "vague";
			break;
		}

		return theFace;
	}
}
