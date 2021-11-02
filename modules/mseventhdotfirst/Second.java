package modules.mseventhdotfirst;

import java.util.Scanner; // import the Scanner class 

public class Second {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Double average = 0.0;
        int arrayLength = 0;

        System.out.println("number of scores");
        arrayLength = myScan.nextInt();
        double[] scores = new double[arrayLength];

        scores = requestScores(scores, myScan);
        average = averageCalculator(scores);

        System.out.println("average score is: " + average);

        if (average < 5) {
            System.out.println(
                    "La nota mitjana de la classe està suspesa. Els alumnes haurien de preguntar els seus dubtes i treballar més");
        } else if (average >= 5 && average <= 7) {
            System.out.println(
                    "La nota mitjana de la classe és bona, però els alumnes haurien de millorar el treball personal");
        } else if (average > 7) {
            System.out.println("Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat");
        }
    }

    private static double[] requestScores(double[] scores, Scanner scanner) {
        for (int i = 0; (i < scores.length); i++) {
            System.out.println("score number" + " " + (i + 1));
            scores[i] = responseValidator(scanner);
        }

        return scores;
    }

    private static double responseValidator(Scanner scanner) {
        double response = -1.0;
        Boolean askAgain = true;

        for (int i = 0; (i < 5) && askAgain; i++) {
            response = scanner.nextDouble();

            if (response >= 0 && response <= 10) {
                askAgain = false;
                break;
            } else {
                System.out.println("Invalid response. Score must be between 0 - 10.");
            }
        }

        return response;
    }

    private static double averageCalculator(double[] scores) {
        double sumArray = 0.0;

        for (int i = 0; i < scores.length; i++) {
            sumArray = (sumArray + scores[i]);
        }

        return (double) sumArray / scores.length;
    }
}