/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.withprinciple;

/**
 *
 * @author GCA
 */
public class Calculator {
    private int result;

    public Calculator() {
        result = 0;
    }

    public void add(int num) {
        result += num;
        System.out.println("Result: " + result);
    }

    public void subtract(int num) {
        result -= num;
        System.out.println("Result: " + result);
    }

    public void multiply(int num) {
        result *= num;
        System.out.println("Result: " + result);
    }

    public void divide(int num) {
        if (num != 0) {
            result /= num;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero");
        }
    }
}

class CalculatorController {
    private Calculator calculator; 

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    public void performAddition(int num) {
        calculator.add(num);
    }

    public void performSubtraction(int num) {
        calculator.subtract(num);
    }

    public void performMultiplication(int num) {
        calculator.multiply(num);
    }

    public void performDivision(int num) {
        calculator.divide(num);
    }
}
class WithController {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();         
        CalculatorController controller = new CalculatorController(calculator);  

        controller.performAddition(10);   
        controller.performSubtraction(5); 
        controller.performMultiplication(2); 
        controller.performDivision(0);    
    }
}
