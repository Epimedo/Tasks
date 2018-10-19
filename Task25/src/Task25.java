
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
