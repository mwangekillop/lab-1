package com.example.hellofx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {

    // UPDATE THESE WITH YOUR ACTUAL DETAILS
    private final String STUDENT_NAME = "MWANGE MWANAKULYA";
    private final String STUDENT_NUMBER = "202504072";

    @Override
    public void start(Stage stage) {
        String defaultMessage = "Welcome, " + STUDENT_NAME + "!";
        Label message = new Label(defaultMessage);

        Button startButton = new Button("Start");
        Button resetButton = new Button("Reset");

        // Event Handler for Start Button
        startButton.setOnAction(event ->
                message.setText("Great! You clicked Start.")
        );

        // Event Handler for Reset Button
        resetButton.setOnAction(event ->
                message.setText(defaultMessage)
        );

        // Button alignment
        HBox buttonBox = new HBox(10, startButton, resetButton);
        buttonBox.setAlignment(Pos.CENTER);

        // Main Layout
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(message, buttonBox);

        Scene scene = new Scene(layout, 500, 300);

        stage.setTitle("My First JavaFX Application - " + STUDENT_NUMBER);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}