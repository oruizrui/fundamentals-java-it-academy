package src;

import base.scanner.Scann;
import base.scanner.ScannnString;

public class first {

    public static void main(String[] args) {
        String userName = "";
        String userAge = "";

        // Enter username and press Enter
        System.out.println("Could you give me your name and first name, please?");
        userName = ScannnString.scann();

        System.out.println("Could you give me your age, please?");
        userAge = ScannnString.scann();

        ScannnString.close();

        System.out.println("Name is: " + userName);
        System.out.println("Age is: " + userAge);
    }
}
