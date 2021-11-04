/* 
(M5) Exercici 4

Has de modificar el programa anterior per afegir una nova funcionalitat: establir un número màxim de 5 intents.
Si l’usuari encerta el número escollit pel programa abans d'aquests 5 intents, el programa mostra el següent missatge per pantalla: “Enhorabona, el número és X i has necessitat Y intents per encertar-lo”.
Si no encerta el número abans de 5 intents, el programa mostra per pentalla: "Has utilitzat massa intents! El número és X ".
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
