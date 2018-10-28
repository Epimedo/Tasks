package epam.halavin.task33.controller;

import epam.halavin.task33.model.MethodsForNumbers;
import epam.halavin.task33.view.util.Input;
import epam.halavin.task33.view.util.Output;

public class Task33 {

	public static void main(String[] args) {
		MethodsForNumbers methodsnum = new MethodsForNumbers();
		int number = Input.consoleInputInt();

		Output.logOutput("The number " + number + " is perfect : " + methodsnum.isNumberPerfect(number));
	}

}
