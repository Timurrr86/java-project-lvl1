package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String getPlayerName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scName = new Scanner(System.in);
        return scName.next();
    }
    public static int getRandomNumber() {
        int number = 1 + (int) (Math.random() * 100);
        return number;
    }
    public static String getAnswer() {
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    public static int getAnswerInt() {
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static void gameBody(String task, String[] questions, String[] correctAnswer) {
        String name = Engine.getPlayerName();
        System.out.println("Hello, " + name + "!");
        System.out.println(task);
        int numberOfCorrectAnswer = 0;
        for(int i = 0; i < 3; i++) {
            //выводим число в диапазоне от 1 до 100
            System.out.print("Question: ");
            System.out.println(questions[i]);
            String answer = Engine.getAnswer();
            if(answer.equals(correctAnswer[i])) {
                System.out.println("Correct!");
                numberOfCorrectAnswer += 1;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer[i] + "'" + ".\n" +
                        "Let's try again, " + name);
                break;
                }
            }
            System.out.println();
        if(numberOfCorrectAnswer >= 3) {
            System.out.println("Congratulations, " + name);
        }
        }
}
