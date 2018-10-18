
public class MethodsForProcessing {
	static final double forProcessing = 1000.;

	public double getWeightInKg(double weight) {
		return weight;
	}

	public double getWeightInMg(double weight) {
		return weight * forProcessing;
	}

	public double getWeightInTons(double weight) {
		return weight / forProcessing;
	}
}
