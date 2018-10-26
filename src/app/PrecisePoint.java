package app;

import java.math.BigDecimal;

public class PrecisePoint {
	private BigDecimal X;
	private BigDecimal Y;

	public PrecisePoint(BigDecimal x, BigDecimal y) {
		X = x;
		Y = y;
	}

	public BigDecimal getX() {
		return X;
	}

	public void setX(BigDecimal x) {
		X = x;
	}

	public BigDecimal getY() {
		return Y;
	}

	public void setY(BigDecimal y) {
		Y = y;
	}
}
