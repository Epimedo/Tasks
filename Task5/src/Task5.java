
public class Task5 {

	public static void main(String[] args) {
		Input input = new Input();
		Output output = new Output();
		MathCalculating mathcalc = new MathCalculating();

		double number = input.consoleInput();

		output.consoleOutput("The average of number's digits is  " + mathcalc.getAverage(number));
		output.consoleOutput("The geometric of number's digits is " + mathcalc.getGeometric(number));

	}

}
