/* 
(M7.2.) Exercici 3

Fes un programa que mostri el següent per pantalla:

*

* *

* * *

* * * *

* * * * *

* * * * * *

* * * * *

* * * *

* * *

* *

*

La línea amb més “*” vindrà donada per un número que l’usuari introduirà per consola.

Condició: En tot el codi del programa només hi pot haver-hi dos *

També, a poder ser, no utilitzis cap mètode com repeat() o substring() de la classe String
*/

package modules.mseventhdotsecond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; // import the Scanner class 

public class Three {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int line = 0;
        String output = "";
        ArrayList<String> linesAsc = new ArrayList<String>();
        ArrayList<String> linesDesc = new ArrayList<String>();

        System.out.println("How many lines do you want?");
        line = myScan.nextInt();
        myScan.close();

        for (int i = 0; i < line; i++) {
            output = output + " *";
            linesAsc.add(output);
        }

        linesDesc = (ArrayList<String>) linesAsc.clone();
        Collections.sort(linesDesc, Collections.reverseOrder());
        printSLines(linesAsc);
        linesDesc.remove(0);
        printSLines(linesDesc);
    }

    private static void printSLines(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}