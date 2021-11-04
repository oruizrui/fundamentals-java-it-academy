/* 
(M7.2.) Exercici 5
L’usuari introdueix un nombre per teclat i el programa imprimeix per pantalla si el nombre és primer o no
*/

package modules.mseventhdotsecond;

import java.util.ArrayList;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int number = 0;

        System.out.println("number to check if is prime");
        number = myScan.nextInt();
        myScan.close();

        checkPrime(number);
    }

    private static void checkPrime(Integer number) {
        Boolean prime = false;
        // https://www.javatpoint.com/prime-number-program-in-java
    }
}
