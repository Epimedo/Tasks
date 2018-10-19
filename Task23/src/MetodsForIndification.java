
public class MetodsForIndification {
	final static String STRVOWEL = "aeiouy";

	public String isVowelOne(char symbol) {
		symbol = Character.toUpperCase(symbol);
		switch (+symbol) {
		case 65:
		case 69:
		case 73:
		case 79:
		case 85:
		case 89:
			return "vowel";
		default:
			return "not vowel";
		}
	}

	public String isVowelTwo(char symbol) {
		String str = Character.toLowerCase(symbol) + "";

		if (str.matches("^(?i:[aeiouy]).*")) {
			return "vowel";
		}

		return "not vowel";
	}

	public String isVowelThree(char symbol) {
		symbol = Character.toLowerCase(symbol);

		for (int i = 0; i < STRVOWEL.length() - 1; i++) {
			if (symbol == STRVOWEL.charAt(i)) {
				return "vowel";
			}
		}

		return "not vowel";
	}

	public String isVowelFour(char symbol) {
		symbol = Character.toLowerCase(symbol);

		for (char ch : STRVOWEL.toCharArray()) {
			if (ch == symbol) {
				return "vowel";
			}
		}
		return "not vowel";
	}
}
