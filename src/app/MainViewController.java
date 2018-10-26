package app;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Slider;

public class MainViewController {
	@FXML
	LineChart<Number, Number> chartView;
	@FXML
	Slider zoomSliderX;
	@FXML
	Slider zoomSliderY;

	public MainViewController() {
	}

	public void fillChart() {

	}
}
