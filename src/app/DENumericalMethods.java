package app;

import javafx.geometry.Point2D;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.LinkedList;

public class DENumericalMethods {
	private final MathContext mathContext = new MathContext(6);
	private BigDecimal bigH;
	private double h;
	private double x0, X;
	private double y0;
	private Function2<BigDecimal, BigDecimal, BigDecimal> yPrime;

	public DENumericalMethods(double x0, double y0, double X,
	                          Function2<BigDecimal, BigDecimal, BigDecimal> yPrime, double h) {
		this.bigH = BigDecimal.valueOf(h);
		this.h = h;
		this.x0 = x0;
		this.X = X;
		this.yPrime = yPrime;
		this.y0 = y0;
	}

	public void setH(double h) {
		this.bigH = BigDecimal.valueOf(h);
	}

	public Collection<PrecisePoint> euler() {
		LinkedList<PrecisePoint> polyline = new LinkedList<>();
		polyline.add(new PrecisePoint(x0, y0));

		for (double i = x0; i < X; i += h) {
			PrecisePoint prev = polyline.getLast();
			BigDecimal y = prev.getY().add
					(yPrime.f(prev.getX(), prev.getY()).multiply(bigH)).setScale(6, RoundingMode.HALF_UP);
			polyline.add(new PrecisePoint(prev.getX().add(bigH), y));
		}

		for (PrecisePoint point : polyline) {
			System.out.println(point.getX() + "\t" + point.getY());
		}

		return polyline;
	}

	public Collection<Point2D> eulerImproved() {
		return null;
	}

	public Collection<Point2D> RungeKutta() {
		return null;
	}

	private BigDecimal big(double x) {
		return BigDecimal.valueOf(x);
	}

//	private BigDecimal f(BigDecimal x, BigDecimal y) {
//		double xd = x.doubleValue();
//		double yd = y.doubleValue();
//		//System.out.println(xd + "\t" + yd);
//		BigDecimal result = BigDecimal.valueOf(yPrime.f(xd, yd));
//		return result;
//	}
}
