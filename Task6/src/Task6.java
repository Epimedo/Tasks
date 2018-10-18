
public class Task6 {

	public static void main(String[] args) {
		double number = new Input().consoleInput();
		
		new Output().consoleOutput(
				"The reverse of number " + number + " is " + new MethodsForWork().getReverseNumber(number));
	}

}
