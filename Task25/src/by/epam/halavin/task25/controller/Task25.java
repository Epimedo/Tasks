package by.epam.halavin.task25.controller;

import by.epam.halavin.task25.model.entity.Date;
import by.epam.halavin.task25.model.logic.DefineNextDay;
import by.epam.halavin.task25.view.Input;
import by.epam.halavin.task25.view.Output;

public class Task25 {

	public static void main(String[] args) {
		Date date = new Date();
		Date nextdate = new Date();
		DefineNextDay defday = new DefineNextDay();

		date.setDay(Input.consoleInput());
		date.setMonth(Input.consoleInput());
		date.setYear(Input.consoleInput());
		nextdate = defday.defineNextDay(date);

		Output.consoleOutput("The previous date is " + date.getDay() + "." + date.getMonth() + "." + date.getYear());
		Output.consoleOutput(
				"The next date is " + nextdate.getDay() + "." + nextdate.getMonth() + "." + nextdate.getYear() + ".");
	}

}
