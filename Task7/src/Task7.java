
public class Task7 {

	public static void main(String[] args) {
		Input input = new Input();
		Output output = new Output();
		
		int a = input.consoleInput();
		int b = input.consoleInput();
		
		a += b - (b = a);
		
		output.consoleOutput("Number a is " + a);
		output.consoleOutput("Number b is " + b);

	}

}
