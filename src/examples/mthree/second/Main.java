package modules.mthree.second;

import java.util.Scanner; // import the Scanner class 

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int integerFirst = 0;
        int integerSecond = 0;

        // Enter inputs and press Enter
        System.out.println("Could you give me a number (integer), please?");
        integerFirst = myScan.nextInt();
        System.out.println("Could you give me another number (integer), please?");
        integerSecond = myScan.nextInt();
        myScan.close();

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