package src.examples.mthree;

import src.base.scanner.ScannInteger;

public class Second {
    public static void main(String[] args) {
        int integerFirst = 0;
        int integerSecond = 0;

        // Enter inputs and press Enter
        System.out.println("Could you give me a number (integer), please?");
        integerFirst = ScannInteger.scann();
        System.out.println("Could you give me another number (integer), please?");
        integerSecond = ScannInteger.scann();

        ScannInteger.close();

        System.out.println("Thanks!, Lets operate with them");
        System.out.println("El resultat de la suma és: " + (integerFirst + integerSecond));
        System.out.println("El resultat de la resta és: " + (integerFirst - integerSecond));
        System.out.println("El resultat de la multiplicació és: " + (integerFirst * integerSecond));
        if (integerSecond == 0) {
            System.out.println("integerSecord can't be 0");
        } else {
            System.out.println("El resultat de la divisió és: " + ((double) integerFirst / integerSecond));
        }
    }
}