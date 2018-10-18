
public class Task22 {

	public static void main(String[] args) {
		Cordinates cord1 = new Cordinates();
		Cordinates cord2 = new Cordinates();
		Cordinates cord3 = new Cordinates();
		MethodsForTriangle mthods = new MethodsForTriangle();
		
		cord1.setX(Input.consoleInput());
		cord1.setY(Input.consoleInput());
		cord2.setX(Input.consoleInput());
		cord2.setY(Input.consoleInput());
		cord3.setX(Input.consoleInput());
		cord3.setY(Input.consoleInput());
		
		Output.consoleOutput(
				"The dots make up the restangular triangle : " + mthods.isTriangleRectangular(cord1, cord2, cord3));
	}

}
