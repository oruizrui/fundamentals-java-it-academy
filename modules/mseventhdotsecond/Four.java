/* 
(M7.2.) Exercici 4
Realitzar un programa on l’usuari introdueix un número i el programa li retorna el factorial del número introduit
*/

package modules.mseventhdotsecond;

import java.util.Scanner; // import the Scanner class 

public class Four {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int number;
        int factorial = 1;

        System.out.println("Could you give me a number?");
        number = myScan.nextInt();
        myScan.close();

        while (number != 0) {
            factorial = factorial * number;
            number--;
        }

        System.out.println(factorial);
    }
}
