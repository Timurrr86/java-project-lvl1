package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void play() {
        String name = Engine.getPlayerName();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.\n");
        int numberOfCorrectAnswer = 0;
        for(int i = 0; i < 3; i++) {
            //выводим число в диапазоне от 1 до 100
            int x = 1 + (int) (Math.random() * 100);
            System.out.println("Question: " + x);
            String answer = Engine.getAnswer();
            if(x % 2 == 0) {
                if(answer.equals("yes")) {
                    System.out.println("Correct!");
                    numberOfCorrectAnswer += 1;
                    } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.\n" +
                            "Let's try again, " + name);
                    break;
                    }
                }
            if(x % 2 != 0) {
                if(answer.equals("no")) {
                    System.out.println("Correct!");
                    numberOfCorrectAnswer += 1;
                    } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.\n" +
                            "Let's try again, " + name);
                    break;
                }
            }
            System.out.println();
        }
        Engine.gameResult(numberOfCorrectAnswer, name);
        }
}
