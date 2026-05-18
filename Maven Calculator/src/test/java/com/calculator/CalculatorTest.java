package com.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

@ExtendWith(ApplicationExtension.class)
public class CalculatorTest {

    private CalculatorApp app;

    @Start
    public void start(Stage stage) throws Exception {
        app = new CalculatorApp();
        app.start(stage);
    }

    @Test
    public void testBasicAddition(FxRobot robot) {
        robot.clickOn("2");
        robot.clickOn("+");
        robot.clickOn("3");
        robot.clickOn("=");
        
        TextField display = robot.lookup("#display").queryAs(TextField.class);
        assertEquals("5", display.getText());
    }

    @Test
    public void testBasicSubtraction(FxRobot robot) {
        robot.clickOn("9");
        robot.clickOn("-");
        robot.clickOn("4");
        robot.clickOn("=");
        
        TextField display = robot.lookup("#display").queryAs(TextField.class);
        assertEquals("5", display.getText());
    }

    @Test
    public void testBasicMultiplication(FxRobot robot) {
        robot.clickOn("6");
        robot.clickOn("*");
        robot.clickOn("7");
        robot.clickOn("=");
        
        TextField display = robot.lookup("#display").queryAs(TextField.class);
        assertEquals("42", display.getText());
    }

    @Test
    public void testBasicDivision(FxRobot robot) {
        robot.clickOn("8");
        robot.clickOn("/");
        robot.clickOn("2");
        robot.clickOn("=");
        
        TextField display = robot.lookup("#display").queryAs(TextField.class);
        assertEquals("4", display.getText());
    }

    @Test
}
