package app;

public class DENumericalMethods {
	private double h;
	private double start, end;
	private double y0;
	private Function2<Double, Double, Double> yPrime;

	public DENumericalMethods(double x0, double y0, double X,
	                          Function2<Double, Double, Double> yPrime, double h) {
		this.h = h;
		this.start = x0;
		this.end = X;
		this.yPrime = yPrime;
		this.y0 = y0;
	}
}
