
public class MethodsForCircles {

	public double getCircleSquare(Circle circle) {
		return Math.PI * circle.getRadius() * circle.getRadius();
	}

	public double getRingSquare(Circle circle1, Circle circle2) {
		return Math.PI * (circle1.getRadius() * circle1.getRadius() - circle2.getRadius() * circle2.getRadius());
	}
}
