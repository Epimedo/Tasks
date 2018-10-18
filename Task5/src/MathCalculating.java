
public class MathCalculating {

	public double getAverage(double number) {
		double sum = 0;

		sum += number % 10;
		number = (number - number % 10) / 10;
		sum += number % 10;
		number = (number - number % 10) / 10;
		sum += number % 10;
		number = (number - number % 10) / 10;
		sum += number % 10;
		number = (number - number % 10) / 10;
		sum += number % 10;
		number = (number - number % 10) / 10;
		sum += number % 10;

		return sum / 6;
	}

	public double getGeometric(double number) {
		double composition = 1;

		composition *= number % 10;
		number = (number - number % 10) / 10;
		composition *= number % 10;
		number = (number - number % 10) / 10;
		composition *= number % 10;
		number = (number - number % 10) / 10;
		composition *= number % 10;
		number = (number - number % 10) / 10;
		composition *= number % 10;
		number = (number - number % 10) / 10;
		composition *= number % 10;

		return Math.pow(composition, 1. / 6);
	}

}
