package com.sports21c.jfxclient;

import javafx.application.Application;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
    	  	
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
        
    }
//	@Override
//	protected void initSettings(GameSettings settings)
//	{
//		settings.setTitle("Sports Client");
//	}

    public static void main(String[] args) {
        launch();
    }

}