package epam.halavin.task32.controller;

import epam.halavin.task32.view.util.Input;
import epam.halavin.task32.view.util.Output;
import epam.halavin.task32.model.MethodsForProcessing;;

public class Task32 {

	public static void main(String[] args) {
		int number1 = Input.consoleInputInt();
		int number2 = Input.consoleInputInt();

		Output.logOutput("The largest gigit in number is " + MethodsForProcessing.getLargestDigit(number1));

		Output.logOutput("The number is palindrome :" + MethodsForProcessing.isNumberPalindrome(number1));

		Output.logOutput("The number is simple :" + MethodsForProcessing.isNumberSimple(number1));

		Output.logOutput("The list of deviders :" + MethodsForProcessing.getListDeviders(number1));

		Output.logOutput("The count of unique digits is " + MethodsForProcessing.getCountOfDifferentDigits(number1));

		Output.logOutput("The greates common division is " + MethodsForProcessing.getGCD(number1, number2));

		Output.logOutput("The least common multiple is " + MethodsForProcessing.getLCM(number1, number2));
	}

}
