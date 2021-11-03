/* 
(M4) Exercici 4

L’usuari introdueix un mes per pantalla i mitjançant un switch amb els 12 mesos de l’any, el programa calcula els dies del mes i mostra el següent: 

Exemple: Si el número introduït és 1, llavors ha d'aparèixer per pantalla: “El mes de gener té 31 dies”
*/

package modules.mfifth;

import java.util.Scanner; // import the Scanner class 

public class Four {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int randomInteger = (int) (Math.random() * (10));
        int givedInteger = 11;
        int attemp = 0;
        Boolean askAgain = true;

        while (attemp < 5 && askAgain == true) {
            System.out.println("Could you found the hidden number? (between 0 - 10)");
            givedInteger = myScan.nextInt();

            if (randomInteger == givedInteger) {
                askAgain = false;
            }
            attemp++;
        }
        myScan.close();

        if (askAgain == true) {
            System.out.println("You don't have more attempts. the number was " + randomInteger);
        } else {
            System.out.println("Congrats, the number was " + randomInteger);
        }

    }
}
