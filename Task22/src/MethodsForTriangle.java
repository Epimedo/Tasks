
public class MethodsForTriangle {

	public boolean isTriangle(Cordinates cord1, Cordinates cord2, Cordinates cord3) {
		return (cord3.getX() - cord1.getX()) / (cord3.getX() - cord2.getX()) != (cord3.getY() - cord1.getY())
				/ (cord3.getY() - cord2.getY());
	}

	public boolean isTriangleRectangular(Cordinates cord1, Cordinates cord2, Cordinates cord3) {
		if (isTriangle(cord1, cord2, cord3)) {
			double d1 = 0.;
			double d2 = 0.;
			double d3 = 0.;

			d1 = Math.sqrt(Math.pow(cord1.getX() - cord2.getX(), 2.) + Math.pow(cord1.getY() - cord2.getY(), 2.));
			d2 = Math.sqrt(Math.pow(cord1.getX() - cord3.getX(), 2.) + Math.pow(cord1.getY() - cord3.getY(), 2.));
			d3 = Math.sqrt(Math.pow(cord3.getX() - cord1.getX(), 2.) + Math.pow(cord3.getY() - cord2.getY(), 2.));

			return (Math.sqrt(d1 * d1 + d2 * d2) == d3) || (Math.sqrt(d1 * d1 + d3 * d3) == d2)
					|| (Math.sqrt(d2 * d2 + d3 * d3) == d1);
		}
		Output.consoleOutput("The dots don't make up the triangle");
		return false;
	}
}
