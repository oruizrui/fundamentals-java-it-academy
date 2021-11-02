/* 
(M3) Exercici 3
El programa demana a l'usuari que introdueixi 3 notes i el programa mostra la mitjana de les 3 notes per pantalla.

*Les notes que introdueix l'usuari són números enters però la mitja pot tenir decimals.

*/

package modules.mthree;

import java.util.ArrayList;
import java.util.Scanner; // import the Scanner class 

public class Three {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int[] intArray = new int[3];
        int sumArray = 0;

        ArrayList

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