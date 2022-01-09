package com.example.javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public void start(Stage primaryStage){
        Button button=new Button("Hello World");
        StackPane root=new StackPane();
        root.getChildren().add(button);

        Scene scene=new Scene(root,400,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("First JavaFX app");
        primaryStage.show();

        button.setOnAction(new Handler());
    }
    class Handler implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent actionEvent) {
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}