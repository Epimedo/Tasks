
public class Task2 {

	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		Input input = new Input();
		Output output = new Output();

		numbers.setA(input.consoleInput());
		numbers.setB(input.consoleInput());
		numbers.setC(input.consoleInput());

		output.consoleOutput("The numbers are th same, it is "
				+ new MethodsForChecking().checkWhetherTheSame(numbers.getA(), numbers.getB(), numbers.getC()));
	}

}
