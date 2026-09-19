package com.csc311_mod3_gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("GUI_Basics.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 753, 566);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

}
