package src.examples.mthree;

import src.base.scanner.ScannInteger;

public class Three {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        int sumArray = 0;

        System.out.println("Could you give me a score?");
        intArray[0] = ScannInteger.scann();
        System.out.println("Could you give me an other score?");
        intArray[1] = ScannInteger.scann();
        System.out.println("Could you give me the last score?");
        intArray[2] = ScannInteger.scann();
        ScannInteger.close();

        for (int i = 0; i < intArray.length; i++) {
            sumArray = (sumArray + intArray[i]);
        }

        System.out.println("Your average score is: " + ((double) sumArray / intArray.length));
    }
}