
public class Task3 {

	public static void main(String[] args) {
		Circle firstcirc = new Circle();
		Circle secondcrirc = new Circle();
		Output output = new Output();
		Input input = new Input();

		firstcirc.setRadius(input.consoleInput());
		secondcrirc.setRadius(input.consoleInput());

		output.consoleOutput("The ring's square is " + new MethodsForCircles().getRingSquare(firstcirc, secondcrirc));
	}

}
