package examples.mfour.third;

import java.util.Scanner; // import the Scanner class 

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int userAge = 0;
        String userStudies = "error";
        String userWork = "error";

        // Enter username and press Enter
        System.out.println("Could you give me your age, please?");
        userAge = myObj.nextInt();
        System.out.println("Do you have university studies? (yes/no)");
        userStudies = handleUserResponseYesNo(myObj);

        System.out.println("Do you have work? (yes/no)");
        userWork = handleUserResponseYesNo(myObj);

        myObj.close();

        if ((userAge >= 18 && userStudies.equals("yes")) || userWork.equals("no")) {
            System.out.println("Your beca has been approved.");
        } else {
            System.out.println("You dont fit on the requirements to get a beca.");
        }
    }

    private static String handleUserResponseYesNo(Scanner scanner) {
        String response = "error";
        Boolean askAgain = true;

        System.out.println("1cheeeker----------");
        System.out.println(response);
        System.out.println(askAgain);
        System.out.println("----------");

        for (int i = 0; (i < 5) && askAgain; i++) {
            response = scanner.nextLine();

            if (responseIsValid(response) == true) {
                askAgain = false;

                System.out.println("2cheeeker----------");
                System.out.println(response);
                System.out.println(askAgain);
                System.out.println("----------");
                break;
            } else {
                System.out.println("3cheeeker----------");
                System.out.println(response);
                System.out.println(askAgain);
                System.out.println("----------");

                System.out.println("Invalid response. Must be yes / no.");
            }
        }

        return response;
    }

    private static boolean responseIsValid(String str) {
        return str.equals("yes") || str.equals("no");
    }
}
