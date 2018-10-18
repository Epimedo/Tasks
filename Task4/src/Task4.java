
public class Task4 {

	public static void main(String[] args) {
		double number = new Input().consoleInput();

		new Output().consoleOutput(
				"The digits of number are increasing, it is " + new MethodsForChecking().areDigitsIncreasing(number));
	}

}
