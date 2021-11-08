package com.example.projectosbb;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button EnterButton;

    @FXML
    private Label Text2Field;

    @FXML
    private Button ExitButton;

    @FXML
    private Label Text1Filed;

    @FXML
    private Button OtherButtonsButton;

    @FXML
    private AnchorPane AnchorPaneMain;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private Button RegButton;

    @FXML
    private TextField LoginFiled;
    private Stage stage;

    @FXML
    void enterAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/com/example/projectosbb/menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 325,410 );
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void initialize() {
        EnterButton.setOnAction(actionEvent -> {
            System.out.println("Ви натиснули на кнопку увійти");
        });
        ExitButton.setOnAction(actionEvent ->  {
            System.out.println("Ви вийшли з программи");
        });
        OtherButtonsButton.setOnAction(actionEvent -> {
            System.out.println("Ви натиснули на кнопку додаткових функцій");
        });
        RegButton.setOnAction(actionEvent -> {
            System.out.println("Ви натиснули на кнопку реєстрації нового користувача");
        });
    }
}



