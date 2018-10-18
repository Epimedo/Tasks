
public class Task1 {

	public static void main(String[] args) {
		Dinosaur dino = new Dinosaur();
		MethodsForProcessing methods = new MethodsForProcessing();
		Output output = new Output();

		dino.setWeight(new Input().consoleInput());

		output.consoleOutput("Weight in kilograms is: " + methods.getWeightInKg(dino.getWeight()));
		output.consoleOutput("Weight in milligrams is: " + methods.getWeightInMg(dino.getWeight()));
		output.consoleOutput("Weight in tons is: " + methods.getWeightInTons(dino.getWeight()));

	}

}
