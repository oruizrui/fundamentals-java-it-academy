/* 
(M7.1.) Exercici 3
L’usuari ha d'introduir un número i el programa ha de mostrar per pantalla si el número és parell o imparell.
*/

package modules.mseventhdotfirst;

import java.util.Scanner; // import the Scanner class 

public class Three {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int number;

        System.out.println("Could you give me a numer please?");
        number = myScan.nextInt();
        myScan.close();

        if ((number % 2) == 0) {
            System.out.println("is parell");
        } else {
            System.out.println("is imparell");
        }
    }
}
