/* 
(M5) Exercici 5

Has de modificar el programa de les beques (ara el programa només ha de poder donar 5 beques).
El programa anirà demanant les dades dels alumnes fins que es donin aquestes 5 beques. Un cop el programa hagi assignat les 5 beques s’ha de mostrar per pantalla els noms dels 5 alumnes que tenen beca.
*/

package modules.mfifth;

import java.util.ArrayList;
import java.util.Scanner; // import the Scanner class 

public class Fifth {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        ArrayList<String> acceptedPersons = new ArrayList<String>();
        String name = "";
        System.out.println("Start beca program");
        System.out.println();
        while (acceptedPersons.size() < 5) {
            System.out.println();
            System.out.println("-------------");
            System.out.println("Could you give me your name?");
            name = myScan.nextLine();

            System.out.println("request beca for " + name);

            if (requestBeca(myScan) == true) {
                System.out.println("Beca for " + name + " has been approved");
                acceptedPersons.add(name);
            } else {
                System.out.println("Beca for " + name + " has been revoqued");
            }

        }
        myScan.close();
        System.out.println("-------------");
        System.out.println("We can give more becas.");
        System.out.println("-------------");

        System.out.println("Accepted persons");
        System.out.println(acceptedPersons);
    }

    private static Boolean requestBeca(Scanner myScan) {
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

        return (userAge >= 18 && userStudies.equals("yes")) || userWork.equals("no");
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
