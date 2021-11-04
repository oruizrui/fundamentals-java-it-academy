/* 
(M7.1.) Exercici 6

Taula de multiplicar. L’usuari introduirà un número (del 1 al 10) per pantalla, i el programa li mostrarà la taula de multiplicar d’aquell número.

Exemple:
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
...
2 x 10 = 20
*/

package modules.mseventhdotfirst;

import java.util.Scanner; // import the Scanner class 

public class Sixth {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int number = 0;

        System.out.println("Give me a number");
        number = myScan.nextInt();
        myScan.close();

        System.out.println("---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}