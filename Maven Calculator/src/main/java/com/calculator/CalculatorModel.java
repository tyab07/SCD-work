package com.calculator;

public class CalculatorModel {
    private double operand = 0;
    private String operator = "";
    private boolean hasOperand = false;

    public void setOperand(double value) {
        this.operand = value;
        this.hasOperand = true;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculate(double secondOperand) throws ArithmeticException {
        if (!hasOperand) {
            return secondOperand;
        }

        double result;
        switch (operator) {
            case "+":
                result = operand + secondOperand;
                break;
            case "-":
                result = operand - secondOperand;
                break;
            case "×":
            case "*":
                result = operand * secondOperand;
                break;
            case "÷":
            case "/":
                if (secondOperand == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                result = operand / secondOperand;
                break;
            default:
                result = secondOperand;
        }

        operand = result;
        return result;
    }

    public void clear() {
        operand = 0;
        operator = "";
        hasOperand = false;
    }

    public double getOperand() {
        return operand;
    }

    public String getOperator() {
        return operator;
    }
}