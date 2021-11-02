package modules.mthree.three;

import java.util.Scanner; // import the Scanner class 

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int[] intArray = new int[3];
        int sumArray = 0;

        System.out.println("Could you give me a score?");
        intArray[0] = myScan.nextInt();
        System.out.println("Could you give me an other score?");
        intArray[1] = myScan.nextInt();
        System.out.println("Could you give me the last score?");
        intArray[2] = myScan.nextInt();
        myScan.close();

        for (int i = 0; i < intArray.length; i++) {
            sumArray = (sumArray + intArray[i]);
        }

        System.out.println("Your average score is: " + ((double) sumArray / intArray.length));
    }
}