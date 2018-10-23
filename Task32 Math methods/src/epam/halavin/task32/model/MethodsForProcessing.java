package epam.halavin.task32.model;

public class MethodsForProcessing {

	public static int getLargestDigit(int number) {
		int theLargestDigit = number % 10;

		while (number != 0) {
			if (theLargestDigit < number % 10) {
				theLargestDigit = number % 10;
			}
			number /= 10;
		}

		return theLargestDigit;
	}

	public static boolean isNumberPalindrome(int number) {
		String str1 = "" + number;

		for (int i = 0, j = str1.length() - 1; i < str1.length(); i++, j--) {
			if (str1.charAt(i) != str1.charAt(j)) {
				return false;
			}
		}

		return true;
	}

	public static boolean isNumberSimple(int number) {

		for (int i = number - 1; i > 1; i--) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static String getListDeviders(int number) {
		String str = "\n";

		for (int i = number - 1; i > 1; i--) {
			if (number % i == 0) {
				str += i + "\n ";
			}
		}

		return str;
	}

	public static int getCountOfDifferentDigits(int number) {
		int count = 0;
		int savenumber;

		for (int i = 0; i < 10; i++) {
			savenumber = number;

			while (savenumber != 0) {

				if (savenumber % 10 == i) {
					count++;
					break;
				}
				savenumber /= 10;
			}
		}

		return count;
	}

	public static int getGCD(int number1, int number2) {
		int GCD = 1;

		for (int i = number1; i > 1; i--) {
			if (number1 % i == 0 && number2 % i == 0) {
				if (GCD < i) {
					GCD = i;
				}
			}
		}
		return GCD;
	}

	public static int getLCM(int number1, int number2) {
		int LCM = number1;

		while (LCM % number1 != 0 || LCM % number2 != 0) {
			LCM++;
		}

		return LCM;
	}
}
