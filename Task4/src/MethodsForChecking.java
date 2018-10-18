
public class MethodsForChecking {

	public boolean areDigitsIncreasing(double number) {
		double a;
		double b;
		double c;
		double d;

		number = (number - (a = number % 10)) / 10;
		number = (number - (b = number % 10)) / 10;
		number = (number - (c = number % 10)) / 10;
		d = number % 10;

		return (d < c) && (c < b) && (b < a);
	}
}
