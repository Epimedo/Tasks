package by.epam.halavin.task21.controller;

import by.epam.halavin.task21.model.entity.Dragon;
import by.epam.halavin.task21.model.logic.AboutDragonCondition;
import by.epam.halavin.task21.view.util.Input;
import by.epam.halavin.task21.view.util.Output;

public class Task21 {

	public static void main(String[] args) {
		Dragon dragon = new Dragon();
		AboutDragonCondition dragoncon = new AboutDragonCondition();

		dragon.setAge(Input.consoleInput());

		Output.logOutput("The number of heads is " + dragoncon.getHeadCount(dragon));
		Output.logOutput("The number of eyes is " + dragoncon.getEyesCount(dragon));
	}

}
