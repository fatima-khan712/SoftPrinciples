/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.withoutprinciple;

/**
 *
 * @author GCA
 */
class Calculator {
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
class WithoutController {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();  

       
        calculator.add(10);        
        calculator.subtract(5);     
        calculator.multiply(2);    
        calculator.divide(0);      
    }
}