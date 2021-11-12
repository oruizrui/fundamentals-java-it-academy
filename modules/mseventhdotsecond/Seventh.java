/* 
(M7.2.) Exercici 7

L’usuari introdueix un any per teclat
i el programa crida a un mètode que indiqui l’any és de traspàs o no.
*/

package modules.mseventhdotsecond;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int number = 0;

        System.out.println("check Leap year");
        number = myScan.nextInt();
        myScan.close();

        if (checkLeap(number) == true) {
            System.out.println(number + " is a Leap year");
        } else {
            System.out.println(number + " is not a Leap year");
        }
    }

    private static Boolean checkLeap(Integer number) {
        if ((number % 400) == 0) {
            return true;
        }
        if ((number % 4) == 0 && (number % 100) != 0) {
            return true;
        }

        return false;
    }
}
