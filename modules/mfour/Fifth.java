package modules.mfour;

import java.util.Scanner; // import the Scanner class 

public class Fifth {

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
        System.out.println("Could you give an operator? (+, -, * or /)");
        operator = myScan.nextLine();
        myScan.close();

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
            default:
                System.out.println("no operator matched");
            }
            System.out.println(firstNumber + " " + operator + " " + secondNumber + ":");
            System.out.println(mathResult);
        }
    }
}
