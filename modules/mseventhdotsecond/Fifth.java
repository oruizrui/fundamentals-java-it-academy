/* 
(M7.2.) Exercici 5
L’usuari introdueix un nombre per teclat i el programa imprimeix per pantalla si el nombre és primer o no
*/

package modules.mseventhdotsecond;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int number = 0;

        System.out.println("number to check if is prime");
        number = myScan.nextInt();
        myScan.close();

        if (checkPrime(number) == true) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not prime number");
        }
    }

    private static Boolean checkPrime(Integer number) {
        // https://www.mathematical.com/primes0to1000k.html
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i = i + 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }

        }

        return true;
    }
}
