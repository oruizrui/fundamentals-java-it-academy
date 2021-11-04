/* 
(M7.1.) Exercici 1

(M7.1.) Exercici 1

Crea un programa on l’usuari introdueix tres notes i el programa calcula la mitja. Si la mitja és inferior a 5 ha de mostrar el següent missatge per pantalla: “No has superat el curs. Has de recuperar”, si la mitja està entre 5 i 7 ha de mostrar: “Enhorabona! Has aprovat però hauries de seguir practicant”, si la mitja és superior a 7 ha de mostrar: ”Enhorabona! Has superat el curs! Passa ja al següent nivell!
*/

package modules.mseventhdotfirst;

import java.util.Scanner; // import the Scanner class 

public class First {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Double[] intArray = new Double[3];
        Double sumArray = 0.0;
        Double average = 0.0;

        System.out.println("Could you give me a score?");
        intArray[0] = myScan.nextDouble();
        System.out.println("Could you give me an other score?");
        intArray[1] = myScan.nextDouble();
        System.out.println("Could you give me the last score?");
        intArray[2] = myScan.nextDouble();
        myScan.close();

        for (int i = 0; i < intArray.length; i++) {
            sumArray = (sumArray + intArray[i]);
        }

        average = sumArray / intArray.length;
        System.out.println("average score is: " + average);

        if (average >= 0 && average < 5) {
            System.out.println("No has superat el curs. Has de recuperar");
        } else if (average >= 5 && average <= 7) {
            System.out.println("Enhorabona! Has aprovat però hauries de seguir practicant");
        } else if (average > 7) {
            System.out.println("Enhorabona! Has superat el curs! Passa ja al següent nivell!");
        } else {
            System.out.println("error");
        }
    }
}