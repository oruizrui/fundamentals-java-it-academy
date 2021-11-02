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
        ArrayList<Integer> scores = new ArrayList<Integer>();
        Integer sumArray = 0;

        System.out.println("Could you give me a score?");
        scores.add(myScan.nextInt());
        System.out.println("Could you give me an other score?");
        scores.add(myScan.nextInt());
        System.out.println("Could you give me the last score?");
        scores.add(myScan.nextInt());
        myScan.close();

        for (int i = 0; i < scores.size(); i++) {
            sumArray = (sumArray + scores.get(i));
        }

        System.out.println("Your average score is: " + ((double) sumArray / scores.size()));
    }
}