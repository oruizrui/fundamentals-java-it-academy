/* 
(M5) Exercici1
El programa demana quantes paraules vol introduir l'usuari. Aquest, introdueix el número i llavors apareix el següent missatge: "Introdueix la paraula".

Aquest missatge es mostra tantes vegades com número de paraules ha dit l'usuari que volia introduir. Les paraules es guarden en un arrayList i un cop han sigut totes introduïdes, es mostren per pantalla.
*/

package modules.mfifth;

import java.util.Scanner; // import the Scanner class 

public class First {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String userName = "";
        int userAge = 0;
        String tag = "MAJOR";

        // Enter username and press Enter
        System.out.println("Could you give me your name and first name, please?");
        userName = myScan.nextLine();

        System.out.println("Could you give me your age, please?");
        userAge = myScan.nextInt();
        myScan.close();

        if (userAge < 18) {
            tag = "MENOR";
        }

        System.out.println(userName + " ets " + tag + " d'edad");
    }
}