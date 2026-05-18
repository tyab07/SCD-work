package com.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField display;
    
    private CalculatorModel model = new CalculatorModel();
    private boolean startNewNumber = true;
    private boolean errorState = false;

    @FXML
    public void initialize() {
        display.setEditable(false);
        display.setText("0");
    }

    @FXML
    private void handleNumberButton(javafx.event.ActionEvent event) {
        if (errorState) {
            clearError();
        }
        
        Button button = (Button) event.getSource();
        String digit = button.getText();
        
        if (startNewNumber) {
            display.setText(digit);
            startNewNumber = false;
        } else {
            String current = display.getText();
            if (current.equals("0") && !digit.equals(".")) {
                display.setText(digit);
            } else {
                display.setText(current + digit);
            }
        }
    }

    @FXML
    private void handleDecimalButton() {
        if (errorState) {
            clearError();
        }
        
        if (startNewNumber) {
            display.setText("0.");
            startNewNumber = false;
        } else {
            String current = display.getText();
            if (!current.contains(".")) {
                display.setText(current + ".");
            }
        }
    }

    @FXML
    private void handleOperatorButton(javafx.event.ActionEvent event) {
        if (errorState) {
            return;
        }
        
        Button button = (Button) event.getSource();
        String operator = button.getText();
        
        try {
            double currentValue = Double.parseDouble(display.getText());
            model.setOperand(currentValue);
            model.setOperator(operator);
            startNewNumber = true;
        } catch (NumberFormatException e) {
            showError("Invalid number");
        }
    }

    @FXML
    private void handleEqualsButton() {
        if (errorState) {
            return;
        }
        
        try {
            double currentValue = Double.parseDouble(display.getText());
            double result = model.calculate(currentValue);
            
            if (Double.isInfinite(result) || Double.isNaN(result)) {
                showError("Math Error");
            } else {
                display.setText(formatResult(result));
                startNewNumber = true;
            }
        } catch (NumberFormatException e) {
            showError("Invalid number");
        } catch (ArithmeticException e) {
            showError(e.getMessage());
        }
    }

    @FXML
    private void handleClearButton() {
        display.setText("0");
        model.clear();
        startNewNumber = true;
        errorState = false;
    }

    @FXML
    private void handleClearEntryButton() {
        display.setText("0");
        startNewNumber = true;
        errorState = false;
    }

    @FXML
    private void handleBackspaceButton() {
        if (errorState) {
            return;
        }
        
        String current = display.getText();
        if (current.length() > 1) {
            display.setText(current.substring(0, current.length() - 1));
        } else {
            display.setText("0");
            startNewNumber = true;
        }
    }

    @FXML
    private void handleSignButton() {
        if (errorState) {
            return;
        }
        
        try {
            double value = Double.parseDouble(display.getText());
            value = -value;
            display.setText(formatResult(value));
        } catch (NumberFormatException e) {
            showError("Invalid number");
        }
    }

    @FXML
    private void handleSquareButton() {
        if (errorState) {
            return;
        }
        
        try {
            double value = Double.parseDouble(display.getText());
            double result = value * value;
            display.setText(formatResult(result));
            startNewNumber = true;
        } catch (NumberFormatException e) {
            showError("Invalid number");
        }
    }

    @FXML
    private void handleSquareRootButton() {
        if (errorState) {
            return;
        }
        
        try {
            double value = Double.parseDouble(display.getText());
            if (value < 0) {
                showError("Invalid input");
            } else {
                double result = Math.sqrt(value);
                display.setText(formatResult(result));
                startNewNumber = true;
            }
        } catch (NumberFormatException e) {
            showError("Invalid number");
        }
    }

    @FXML
    private void handleReciprocalButton() {
        if (errorState) {
            return;
        }
        
        try {
            double value = Double.parseDouble(display.getText());
            if (value == 0) {
                showError("Cannot divide by zero");
            } else {
                double result = 1 / value;
                display.setText(formatResult(result));
                startNewNumber = true;
            }
        } catch (NumberFormatException e) {
            showError("Invalid number");
        }
    }

    @FXML
    private void handlePercentButton() {
        if (errorState) {
            return;
        }
        
        try {
            double value = Double.parseDouble(display.getText());
            double result = value / 100;
            display.setText(formatResult(result));
            startNewNumber = true;
        } catch (NumberFormatException e) {
            showError("Invalid number");
        }
    }

    private String formatResult(double result) {
        if (result == (long) result) {
            return String.format("%d", (long) result);
        } else {
            String formatted = String.format("%.10f", result);
            formatted = formatted.replaceAll("0*$", "").replaceAll("\\.$", "");
            return formatted;
        }
    }

    private void showError(String message) {
        display.setText(message);
        errorState = true;
        model.clear();
    }

    private void clearError() {
        display.setText("0");
        errorState = false;
        startNewNumber = true;
    }

    public TextField getDisplay() {
        return display;
    }
}