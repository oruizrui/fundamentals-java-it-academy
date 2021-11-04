/* 
L’usuari ha d’introduir dos números, el programa retornarà “Un dels dos números és negatiu”, només si un dels dos números és negatiu.
*/

package modules.mseventhdotfirst;

import java.util.Scanner; // import the Scanner class 

public class Four {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int monthAsString = 0;
        String message = "Invalid day";

        System.out.println("Could you give me a month, please? (1, 2, 3, etc.)");
        monthAsString = myScan.nextInt();
        myScan.close();

        // message = switchCaseImpl(monthAsString, message);
        System.out.println(message);
        System.out.println(monthAsString);
    }
}
