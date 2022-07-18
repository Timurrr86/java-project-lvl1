package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_ROUNDS = 3;

    public static void roundsData(String task, String[][] questionsAndAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(task);
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            //выводим число в диапазоне от 1 до 100
            System.out.print("Question: ");
            System.out.println(questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            if (!answer.equals(questionsAndAnswers[i][1])) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + questionsAndAnswers[i][1] + "'");
                System.out.println("Let's try again, " + name + "!");
                sc.close();
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }
}
