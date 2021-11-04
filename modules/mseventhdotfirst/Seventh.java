/* 
(M7.1.) Exercici 7

Fer un programa on l’usuari introdueix per pantalla un caràcter i un número. El programa imprimeix per pantalla un quadrat amb la mida i el caràcter introduïts per l’usuari.

Exemple:

% % % % %
% % % % %
% % % % %
% % % % %
% % % % %
*/

package modules.mseventhdotfirst;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String character = "";
        int size = 0;

        System.out.println("Let's do a square");
        System.out.println("Give me a letter");
        character = myScan.nextLine();
        System.out.println("size of square");
        size = myScan.nextInt();
        myScan.close();

        printSquare(character, size);
    }

    private static void printSquare(String str, int size) {
        String line = "";

        for (int i = 0; (i < size); i++) {
            line = "";
            for (int a = 0; (a < size); a++) {
                line = line + " " + str;
            }
            System.out.println(line);
        }
    }
}
