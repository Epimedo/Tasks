
public class MethodsForWork {
	public double getReverseNumber(double number) {

		double reversenumber = 0;

		reversenumber += number % 10 * 1000000;
		number = (number - number % 10) / 10;
		reversenumber += number % 10 * 100000;
		number = (number - number % 10) / 10;
		reversenumber += number % 10 * 10000;
		number = (number - number % 10) / 10;
		reversenumber += number % 10 * 1000;
		number = (number - number % 10) / 10;
		reversenumber += number % 10 * 100;
		number = (number - number % 10) / 10;
		reversenumber += number % 10 * 10;
		number = (number - number % 10) / 10;
		reversenumber += number % 10;

		return reversenumber;

	}
}
