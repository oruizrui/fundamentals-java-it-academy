package examples.mfour.fifth;

import java.util.Scanner; // import the Scanner class 

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double firstNumber = 0.0;
        double secondNumber = 0.0;
        double mathResult = 0.0;
        String operator = "";

        // Enter username and press Enter
        System.out.println("Could you give me a number?");
        firstNumber = myObj.nextDouble();
        System.out.println("Could you give me another number?");
        secondNumber = myObj.nextDouble();
        System.out.println("Could you give an operator? (+, -, * or /)");
        operator = myObj.nextLine();
        myObj.close();

        if (operator == "/" && secondNumber == 0) {
            System.out.println("I cant divide by 0");
        } else {
            switch (operator) {
            case "+":
                mathResult = firstNumber + secondNumber;
                break;
            case "-":
                mathResult = firstNumber - secondNumber;
                break;
            case "*":
                mathResult = firstNumber * secondNumber;
                break;
            case "/":
                mathResult = firstNumber / secondNumber;
                break;
            }
            System.out.println(firstNumber + operator + secondNumber);
            System.out.println(mathResult);
        }

    }

}
