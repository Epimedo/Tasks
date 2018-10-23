package epam.halavin.task32.controller;

import epam.halavin.task32.view.util.Input;
import epam.halavin.task32.view.util.Output;
import epam.halavin.task32.model.MethodsForProcessing;;

public class Task32 {

	public static void main(String[] args) {
		int number1 = Input.consoleInputInt();
		int number2 = Input.consoleInputInt();

		Output.consoleOutput("The largest gigit in number is " + MethodsForProcessing.getLargestDigit(number1));

		Output.consoleOutput("The number is palindrome :" + MethodsForProcessing.isNumberPalindrome(number1));

		Output.consoleOutput("The number is simple :" + MethodsForProcessing.isNumberSimple(number1));

		Output.consoleOutput("The list of deviders :" + MethodsForProcessing.getListDeviders(number1));

		Output.consoleOutput(
				"The count of unique digits is " + MethodsForProcessing.getCountOfDifferentDigits(number1));

		Output.consoleOutput("The greates common division is " + MethodsForProcessing.getGCD(number1, number2));

		Output.consoleOutput("The least common multiple is " + MethodsForProcessing.getLCM(number1, number2));
	}

}
