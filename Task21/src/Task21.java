
public class Task21 {

	public static void main(String[] args) {
		Dragon dragon = new Dragon();
		AboutDragonCondition dragoncon = new AboutDragonCondition();

		dragon.setAge(Input.consoleInput());

		Output.consoleOutput("The number of heads is " + dragoncon.getHeadCount(dragon));
		Output.consoleOutput("The number of eyes is " + dragoncon.getEyesCount(dragon));
	}

}
