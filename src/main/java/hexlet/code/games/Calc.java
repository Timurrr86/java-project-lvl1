package hexlet.code.games;

import java.util.Scanner;

public class Calc {
    public static void play() {
        System.out.print("May I have your name? ");
        Scanner scName = new Scanner(System.in);
        String name = scName.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?\n");
        int i = 0;
        while(i < 3) {
            String[] operators = {"+", "-", "*"};
            int count = (int) (Math.random() * 2);
            //выводим число в диапазоне от 1 до 100
            int x = 1 + (int) (Math.random() * 100);
            int y = 1 + (int) (Math.random() * 100);
            System.out.println("Question: " + x + operators[count] + y);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();
            int result = 0;
            switch (operators[count]) {
                case "+" -> result = x + y;
                case "-" -> result = x - y;
                case "*" -> result = x * y;
            }
            if(answer == result) {
                System.out.println("Correct!");
                i += 1;
                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was" + "'" + result + "'" + ".\n" +
                            "Let's try again, " + name);
                    break;
                }
            System.out.println();
        }
        if(i >= 3) {
            System.out.println("Congratulations, " + name);
        }
    }

}
