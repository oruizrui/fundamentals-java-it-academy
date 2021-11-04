/* 
(M7.2.) Exercici 1

 Fes un programa que mostri el següent per pantalla:

*

* *

* * *

* * * *

* * * * *

* * * * * *

El nombre de línies formades per “*” vindrà donat per un número que l’usuari introduirà per consola.
Condició: En tot el codi del programa només hi pot haver un *
També, a poder ser, no utilitzis cap mètode com repeat() o substring() de la classe String
*/

package modules.mseventhdotsecond;

import java.util.Scanner; // import the Scanner class 

public class First {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int line = 0;
        String output = "";

        System.out.println("How many lines do you want?");
        line = myScan.nextInt();
        myScan.close();

        for (int i = 0; i < line; i++) {
            output = output + " *";
            System.out.println(output);
        }
    }
}