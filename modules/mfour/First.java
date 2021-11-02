package modules.mfour.first;

import java.util.Scanner; // import the Scanner class 

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String userName = "";
        int userAge = 0;
        String tag = "MAJOR";

        // Enter username and press Enter
        System.out.println("Could you give me your name and first name, please?");
        userName = myScan.nextLine();

        System.out.println("Could you give me your age, please?");
        userAge = myScan.nextInt();
        myScan.close();

        if (userAge < 18) {
            tag = "MENOR";
        }

        System.out.println(userName + " ets " + tag + " d'edad");
    }
}