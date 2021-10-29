package examples.mfour.first;

import java.util.Scanner; // import the Scanner class 

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName = "";
        int userAge = 0;
        String tag = "MAJOR";

        // Enter username and press Enter
        System.out.println("Could you give me your name and first name, please?");
        userName = myObj.nextLine();

        System.out.println("Could you give me your age, please?");
        userAge = myObj.nextInt();
        myObj.close();

        if (userAge < 18) {
            tag = "MENOR";
        }

        System.out.println(userName + " ets " + tag + " d'edad");
    }
}