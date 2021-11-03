package modules.mfifth;

import java.util.ArrayList;
import java.util.Scanner; // import the Scanner class 

public class First {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Could you give me a word?");
        words.add(myScan.nextLine());
        System.out.println("Could you give me an other word?");
        words.add(myScan.nextLine());
        System.out.println("Could you give me the last word?");
        words.add(myScan.nextLine());
        myScan.close();

        System.out.println("print words list");
        System.out.println(words);
    }
}