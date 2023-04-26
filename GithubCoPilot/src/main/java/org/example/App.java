package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class App extends Application {

    private final Calculator calculator = new Calculator();

    //make application main method
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        TextField textField = new TextField();

        Button addButton = new Button("Add");

        Label value = new Label("0");

        Button resetButton = new Button("Reset");

        resetButton.setOnAction(event -> {
            calculator.resetCalculator();
            value.setText(String.valueOf(calculator.getCurrentValue()));
        });

        //on addButton click change value value to calculator current value
        addButton.setOnAction(event -> {
            int givenValue = Integer.parseInt(textField.getText());
            calculator.add(givenValue);
            value.setText(String.valueOf(calculator.getCurrentValue()));
        });

        primaryStage.setScene(new Scene(new VBox(textField, addButton, value, resetButton), 300, 250));
        primaryStage.show();
    }
}
