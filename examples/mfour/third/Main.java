package examples.mfour.third;

import java.util.Scanner; // import the Scanner class 

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int userAge = 0;
        Boolean userStudies = false;
        Boolean userWork = false;

        // Enter username and press Enter
        System.out.println("Could you give me your age, please?");
        userAge = myObj.nextInt();
        System.out.println("Do you have university studies? (yes/no)");
        userStudies = handleUserResponseYesNo(myObj);

        System.out.println("Do you have work? (yes/no)");
        userWork = handleUserResponseYesNo(myObj);

        myObj.close();

        if ((userAge >= 18 && userStudies) || userWork == false) {
            System.out.println("Your beca has been approved.");
        } else {
            System.out.println("You dont fit on the requirements to get a beca.");
        }
    }

    private static boolean handleUserResponseYesNo(Scanner scanner) {
        String response = "";
        Boolean askAgain = true;

        for (int i = 0; (i < 5) && askAgain; i++) {
            response = scanner.nextLine();

            if (responseIsValid(response) == true) {
                askAgain = false;
                break;
            }
        }

        return responseIsSuccessfull(response);
    }

    private static boolean responseIsValid(String str) {
        return str.equals("yes") || str.equals("no");
    }

    private static boolean responseIsSuccessfull(String str) {
        return str.equals("yes");
    }
}
