package app;

import ch.obermuhlner.math.big.BigDecimalMath;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
		primaryStage.setTitle("Differential Equation");
		primaryStage.setScene(new Scene(root, 800, 600));
		primaryStage.show();

		MainViewController controller = new MainViewController();

		MathContext mathContext = new MathContext(6);
		Function2<BigDecimal, BigDecimal, BigDecimal> yPrime = (x, y) ->
				y.pow(4).multiply(BigDecimalMath.cos(x, mathContext)).add
						(y.multiply(BigDecimalMath.tan(x, mathContext)));
		DENumericalMethods solver = new DENumericalMethods(0, 1, 9.5, yPrime, 0.5);
		solver.euler();

		//System.out.println(yPrime.f(BigDecimal.ONE, BigDecimal.TEN));
	}


	public static void main(String[] args) {
		launch(args);
	}
}
