
public class Task23 {

	public static void main(String[] args) {
		char symbol = Input.getCharSymbol();
		MetodsForIndification methods = new MetodsForIndification();

		Output.consoleOutput("Our symbol is " + methods.isVowelOne(symbol));
		Output.consoleOutput("Our symbol is " + methods.isVowelTwo(symbol));
		Output.consoleOutput("Our symbol is " + methods.isVowelThree(symbol));
		Output.consoleOutput("Our symbol is " + methods.isVowelFour(symbol));
	}

}
