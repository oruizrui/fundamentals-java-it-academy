/* 
(M4) Exercici 3

Una escola d’idiomes concedeix beques a futurs estudiants si compleixen una sèrie de requisits.
A l'alumne se li assigna una beca si és major d’edat i si té un títol universitari. O també se li assigna una beca si l’alumne està a l’atur. 
El programa demana les tres dades per pantalla i en finalitzar mostra si l’alumne té la beca o no.
*/

package modules.mfour;

import java.util.Scanner; // import the Scanner class 

public class Three {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int userAge = 0;
        String userStudies = "error";
        String userWork = "error";

        System.out.println("Could you give me your age, please?");
        userAge = myScan.nextInt();
        myScan.nextLine();
        System.out.println("Do you have university studies? (yes/no)");
        userStudies = handleUserResponseYesNo(myScan);

        System.out.println("Do you have work? (yes/no)");
        userWork = handleUserResponseYesNo(myScan);

        myScan.close();

        if ((userAge >= 18 && userStudies.equals("yes")) || userWork.equals("no")) {
            System.out.println("Your beca has been approved.");
        } else {
            System.out.println("You dont fit on the requirements to get a beca.");
        }
    }

    private static String handleUserResponseYesNo(Scanner scanner) {
        String response = "error";
        Boolean askAgain = true;

        for (int i = 0; (i < 5) && askAgain; i++) {
            response = scanner.nextLine();

            if (responseIsValid(response) == true) {
                askAgain = false;
                break;
            } else {
                System.out.println("Invalid response. Must be yes / no.");
            }
        }

        return response;
    }

    private static boolean responseIsValid(String str) {
        return str.equals("yes") || str.equals("no");
    }
}
