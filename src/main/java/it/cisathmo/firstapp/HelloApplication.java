package it.cisathmo.firstapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("Before the application starts");
    }

    @Override
    public void start(Stage stage) throws Exception {
        Platform.setImplicitExit(false);
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setSpacing(20);
        Label label = new Label("");
        Button button = new Button("Click me!");
        Button button1 = new Button("Exit explicitly");
        button.setOnAction(e->label.setText("Welcome to the jungle!"));
        button1.setOnAction(e-> Platform.exit());
        root.getChildren().addAll(label, button, button1);
        Scene scene = new Scene(root, 900, 600);
        stage.setTitle("Aerosmith");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Exiting application explicitly");
    }

    public static void main(String[] args) {
        System.out.println("launching the app...");
        launch();
    }
}