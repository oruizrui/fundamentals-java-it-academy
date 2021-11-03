/* 
(M4) Exercici 1
Modifica l’exercici 1 del mòdul 3. Un cop introduïdes les dades, el programa ha de mostrar el següent per pantalla:

- Si l’usuari té 18 anys o més: “Nom Cognom, ets MAJOR d’edat” 
- Si l’usuari és menor de 18 anys: “Nom Cognom, ets MENOR d’edat”.
*/

package modules.mfour;

import java.util.Scanner; // import the Scanner class 

public class First {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String userName = "";
        int userAge = 0;
        String tag = "MAJOR";

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