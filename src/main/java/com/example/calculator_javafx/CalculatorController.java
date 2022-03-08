package com.example.calculator_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private Button btn_0;

    @FXML
    private Button btn_1;

    @FXML
    private Button btn_2;

    @FXML
    private Button btn_3;

    @FXML
    private Button btn_4;

    @FXML
    private Button btn_5;

    @FXML
    private Button btn_6;

    @FXML
    private Button btn_7;

    @FXML
    private Button btn_8;

    @FXML
    private Button btn_9;

    @FXML
    private Button btn_Clear;

    @FXML
    private Button btn_Div;

    @FXML
    private Button btn_Equals;

    @FXML
    private Button btn_Minus;

    @FXML
    private Button btn_Multi;

    @FXML
    private Button btn_Plus;

    @FXML
    private TextField text_Display;
    Float data = 0f;
    int op = -1;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if(event.getSource() == btn_1) {
            text_Display.setText(text_Display.getText() + "1");
        } else if(event.getSource() == btn_2) {
            text_Display.setText(text_Display.getText() + "2");
        } else if(event.getSource() == btn_3) {
            text_Display.setText(text_Display.getText() + "3");
        } else if(event.getSource() == btn_4) {
            text_Display.setText(text_Display.getText() + "4");
        } else if(event.getSource() == btn_5) {
            text_Display.setText(text_Display.getText() + "5");
        } else if(event.getSource() == btn_6) {
            text_Display.setText(text_Display.getText() + "6");
        } else if(event.getSource() == btn_7) {
            text_Display.setText(text_Display.getText() + "7");
        } else if(event.getSource() == btn_8) {
            text_Display.setText(text_Display.getText() + "8");
        } else if(event.getSource() == btn_9) {
            text_Display.setText(text_Display.getText() + "9");
        } else if(event.getSource() == btn_0) {
            text_Display.setText(text_Display.getText() + "0");
        } else if(event.getSource() == btn_Clear) {
            text_Display.setText("");
        }
        if(!text_Display.getText().equals("")) {
            if(event.getSource() == btn_Plus) {
                data = Float.parseFloat(text_Display.getText());
                op = 1;
                text_Display.setText("");
            } else if(event.getSource() == btn_Minus) {
                data = Float.parseFloat(text_Display.getText());
                op = 2;
                text_Display.setText("");
            } else if(event.getSource() == btn_Multi) {
                data = Float.parseFloat(text_Display.getText());
                op = 3;
                text_Display.setText("");
            } else if(event.getSource() == btn_Div) {
                data = Float.parseFloat(text_Display.getText());
                op = 4;
                text_Display.setText("");
            } else if(event.getSource() == btn_Equals) {
                Float secondOp = Float.parseFloat(text_Display.getText());
                switch (op) {
                    case 1:
                        Float ans = data + secondOp;
                        text_Display.setText(String.valueOf(ans));
                        break;
                    case 2:
                        ans = data - secondOp;
                        text_Display.setText(String.valueOf(ans));
                        break;
                    case 3:
                        ans = data * secondOp;
                        text_Display.setText(String.valueOf(ans));
                        break;
                    case 4:
                        ans = 0f;
                        try {
                            ans = data / secondOp;
                            text_Display.setText(String.valueOf(ans));
                        } catch (Exception e) {
                            text_Display.setText("Error");

                        }
                        text_Display.setText(String.valueOf(ans));
                }
            }
        }
    }
}