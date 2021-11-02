package modules.msixth.first;

import java.util.Scanner; // import the Scanner class 

public class Main {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Double firstNumber = 0.0;
        Double secondNumber = 0.0;
        Double mathResult = 0.0;
        String operator = "";

        // Enter username and press Enter
        System.out.println("Could you give me a number?");
        firstNumber = myScan.nextDouble();
        System.out.println("Could you give me another number?");
        secondNumber = myScan.nextDouble();
        myScan.nextLine();
        System.out.println("Could you give an operator? (+, -, *, / or %)");
        operator = myScan.nextLine();
        myScan.close();

        if (operator == "/" && secondNumber == 0) {
            System.out.println("I cant divide by 0");
        } else {
            switch (operator) {
            case "+":
                mathResult = addition(firstNumber, secondNumber);
                break;
            case "-":
                mathResult = subtraction(firstNumber, secondNumber);
                break;
            case "*":
                mathResult = multiplication(firstNumber, secondNumber);
                break;
            case "/":
                mathResult = division(firstNumber, secondNumber);
                break;
            case "%":
                mathResult = module(firstNumber, secondNumber);
                break;
            default:
                System.out.println("no operator matched");
            }
            System.out.println(firstNumber + " " + operator + " " + secondNumber + ":");
            System.out.println(mathResult);
        }
    }

    private static Double addition(Double num1, Double num2) {
        return num1 + num2;
    }

    private static Double subtraction(Double num1, Double num2) {
        return num1 - num2;
    }

    private static Double multiplication(Double num1, Double num2) {
        return num1 * num2;
    }

    private static Double division(Double num1, Double num2) {
        return num1 / num2;
    }

    private static Double module(Double num1, Double num2) {
        return num1 % num2;
    }
}
