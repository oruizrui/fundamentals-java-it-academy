package modules.mthree;

import java.util.Scanner; // import the Scanner class 

public class First {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String userName = "";
        String userAge = "";

        // Enter username and press Enter
        System.out.println("Could you give me your name and first name, please?");
        userName = myScan.nextLine();

        System.out.println("Could you give me your age, please?");
        userAge = myScan.nextLine();
        myScan.close();

        System.out.println("Name is: " + userName);
        System.out.println("Age is: " + userAge);
    }
}