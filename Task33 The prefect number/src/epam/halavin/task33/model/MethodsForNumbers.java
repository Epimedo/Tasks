package epam.halavin.task33.model;

public class MethodsForNumbers {

	public boolean isNumberPerfect(int number) {
		int sum = 0;

		for (int i = number - 1; i > 0; i--) {
			if (number % i == 0) {
				sum += i;
			}
		}

		if (sum == number) {
			return true;
		}

		return false;
	}
}
