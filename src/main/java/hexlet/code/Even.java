package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void play() {
        System.out.print("May I have your name? ");
        Scanner scName = new Scanner(System.in);
        String name = scName.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.\n");
        int i = 0;
        while(i < 3) {
            //выводим число в диапазоне от 1 до 100
            int x = 1 + (int) (Math.random() * 100);
            System.out.println("Question: " + x);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            if(x % 2 == 0) {
                if(answer.equals("yes")) {
                    System.out.println("Correct!");
                    i += 1;
                    } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.\n" +
                            "Let's try again, " + name);
                    break;
                    }
                }
            if(x % 2 != 0) {
                if(answer.equals("no")) {
                    System.out.println("Correct!");
                    i += 1;
                    } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.\n" +
                            "Let's try again, " + name);
                    break;
                }
            }
            System.out.println();
        }
        if(i >= 3) {
            System.out.println("Congratulations, " + name);
        }
        }
}
