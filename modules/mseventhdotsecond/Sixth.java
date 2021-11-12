/* 
(M7.2.) Exercici 6

L’usuari ha d’introduir números fins que introdueixi un nombre primer. 

En el moment que l’usuari introdueixi un nombre primer, el programa ha de treure per pantalla el següent missatge: Exacte, el número “x” és primer!

Nota: Utilitzar el mètode creat a l'exercici: (M7.2.) Exercici 5
*/

package modules.mseventhdotsecond;

import java.util.Scanner; // import the Scanner class 

public class Sixth {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int number = 0;

        while (checkPrime(number) == false) {
            System.out.println("give me a prime number");
            number = myScan.nextInt();
        }

        myScan.close();
        System.out.println("Good Job! " + number + " is prime number.");
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
