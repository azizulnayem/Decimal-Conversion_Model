package com.example.calculator_model;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TextField textWindow;

    @FXML
    private Label outputShow;

    @FXML
    void clearText(ActionEvent event) {
        textWindow.setText("");
        textWindow.setPromptText("Please Decimal Input Here");
        outputShow.setText("No Input");
    }

    @FXML
    void decimolToBinary(ActionEvent event) {
        String numberString = textWindow.getText().trim();
        if (numberString.isEmpty()) {
            outputShow.setText("No input given");
            outputShow.setTextAlignment(TextAlignment.CENTER);
        } else {
            try {
                int number = Integer.parseInt(numberString);
                String bin = Integer.toBinaryString(number);
                outputShow.setText(bin);
            } catch (NumberFormatException ex) {
                try {
                    float number = Float.parseFloat(numberString);
                    outputShow.setText("No input given");
                    outputShow.setTextAlignment(TextAlignment.CENTER);
                } catch (NumberFormatException ex2) {
                    outputShow.setText("Not a number!");
                    outputShow.setTextAlignment(TextAlignment.CENTER);
                }
            }
        }
    }

    @FXML
    void decimolToHexa(ActionEvent event) {
        String numberString = textWindow.getText().trim();
        if (numberString.isEmpty()) {
            outputShow.setText("No input given");
            outputShow.setTextAlignment(TextAlignment.CENTER);
        } else {
            try {
                int number = Integer.parseInt(numberString);
                String bin = Integer.toHexString(number);
                outputShow.setText(bin);
            } catch (NumberFormatException ex) {
                try {
                    float number = Float.parseFloat(numberString);
                    outputShow.setText("No input given");
                    outputShow.setTextAlignment(TextAlignment.CENTER);
                } catch (NumberFormatException ex2) {
                    outputShow.setText("Not a number!");
                    outputShow.setTextAlignment(TextAlignment.CENTER);
                }
            }
        }
    }

    @FXML
    void decimolToOcta(ActionEvent event) {
        String numberString = textWindow.getText().trim();
        if (numberString.isEmpty()) {
            outputShow.setText("No input given");
            outputShow.setTextAlignment(TextAlignment.CENTER);
        } else {
            try {
                int number = Integer.parseInt(numberString);
                String bin = Integer.toOctalString(number);
                outputShow.setText(bin);
            } catch (NumberFormatException ex) {
                try {
                    float number = Float.parseFloat(numberString);
                    outputShow.setText("No input given");
                    outputShow.setTextAlignment(TextAlignment.CENTER);
                } catch (NumberFormatException ex2) {
                    outputShow.setText("Not a number!");
                    outputShow.setTextAlignment(TextAlignment.CENTER);
                }
            }
        }
    }
    @FXML
    void goToExit(ActionEvent event) {
       System.exit(0);
    }

    @FXML
    void jumpToNext(ActionEvent event) throws IOException {
        FXMLLoader fxml = new FXMLLoader(getClass().getResource("another_page.fxml"));
        Parent newParent = fxml.load();
        Scene newScene = new Scene(newParent);
        Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textWindow.setText(" ");
        textWindow.setPromptText(" ");
        outputShow.setText("No Input");
    }
}
