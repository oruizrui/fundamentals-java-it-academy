/* 
Aquest programa li demana l’edat a l’usuari, en funció d’aquesta, mostrarem un dels següents missatges per pantalla:

Si té 5 anys o menys: preescolar
Si té entre 6 i 11 anys: primària
Si té entre 12 i 15: ESO
Si té entre 16 i 17: Batxillerat
Si és major d'edat: FP o Universitat
*/

package modules.mfifth;

import java.util.Scanner; // import the Scanner class 

public class Second {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int userAge = 0;

        // Enter username and press Enter
        System.out.println("Could you give me your age, please?");
        userAge = myScan.nextInt();
        myScan.close();

        System.out.println(messageForAge(userAge));
    }

    private static String messageForAge(int age) {
        String output = "";

        if (age <= 5) {
            output = "preescolar";
        } else if (age <= 11) {
            output = "primaria";
        } else if (age <= 16) {
            output = "ESO";
        } else {
            output = "FP o Universitat";
        }

        return output;
    }
}
