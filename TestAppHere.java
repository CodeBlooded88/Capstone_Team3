/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapphere;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 *
 * @author Christina
 */
public class TestAppHere extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        MenuButton numOfScoop = new MenuButton("Number of Scoops?");
        MenuItem scoop1 = new MenuItem("1");
        MenuItem scoop2 = new MenuItem("2");
        MenuItem scoop3 = new MenuItem("3");

        MenuButton holder = new MenuButton("Number of Scoops?");
        MenuItem cup = new MenuItem("cup");
        MenuItem cone = new MenuItem("cone");
        numOfScoop.getItems().addAll(scoop1, scoop2, scoop3);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
