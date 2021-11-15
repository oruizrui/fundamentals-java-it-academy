/* 
(M5) Exercici 3

Aquesta línia de codi: Math.ceil((Math.random() * 10));  Retorna un número entre el 0 i el 10 de forma aleatòria.
L’exercici consisteix a què l’usuari ha d'endevinar el número escollit aleatòriament pel programa.
El programa, demana números a l’usuari fins que aquest encerti el número aleatori generat pel programa.
Un cop l’usuari ha endevinat el número, es mostrarà per pantalla el següent missatge: “Enhorabona, el número era X”
*/

package modules.mfifth;

import java.util.Scanner; // import the Scanner class 

public class Third {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int randomInteger = (int) (Math.random() * (11));
        int givedInteger = 1;

        while (randomInteger != givedInteger) {
            System.out.println("Could you found the hidden number? (between 0 - 10)");
            givedInteger = myScan.nextInt();
        }
        myScan.close();

        System.out.println("Congrats, the number was " + randomInteger);
    }
}
