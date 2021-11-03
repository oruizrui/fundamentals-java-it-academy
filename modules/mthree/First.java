/* 
(M3) Exercici 1

Fer un programa que li demani a l’usuari: El nom, el cognom i l’edat.
Un cop l’usuari hagi acabat d’introduir les dades, aquestes s’han de mostrar per pantalla.
*/

package modules.mthree;

import java.util.Scanner; // import the Scanner class 

public class First {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String userName = "";
        String userAge = "";

        System.out.println("Could you give me your name and first name, please?");
        userName = myScan.nextLine();

        System.out.println("Could you give me your age, please?");
        userAge = myScan.nextLine();
        myScan.close();

        System.out.println("Name is: " + userName);
        System.out.println("Age is: " + userAge);
    }
}