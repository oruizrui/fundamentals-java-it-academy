/* 
(M7.2.) Exercici 8

L’usuari introdueix un nombre per teclat i el programa crida a un mètode que ha de mostrar la successió de Fibonacci.

Exemple:

Si l’usuari introdueix el 10 el resultat ha de ser:

0,1,1,2,3,5,8,13,21,34
*/

package modules.mseventhdotsecond;

import java.util.Scanner; // import the Scanner class 

public class Eighth {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.println("give me a number");
        maxNumber = myScan.nextInt();
        myScan.close();

        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");
        System.out.println("");
        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        System.out.println("");
    }
}
