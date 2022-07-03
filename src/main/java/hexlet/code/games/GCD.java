package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void play() {
        String name = Engine.getPlayerName();
        System.out.println("Hello, " + name + "!");
        System.out.println("Find the greatest common divisor of given numbers.\n");
        int numberOfCorrectAnswer = 0;
        for(int i = 0; i < 3; i++) {
            //выводим число в диапазоне от 1 до 100
            int x = 1 + (int) (Math.random() * 100);
            int y = 1 + (int) (Math.random() * 100);
            System.out.println("Question: " + x + " " + y);
            int answer = Engine.getAnswerInt();
            int maxDivisor = Math.min(x, y);
            for(int n = maxDivisor; n >= 1; n--) {
                if(x % n == 0 && y % n == 0) {
                    maxDivisor = n;
                    break;
                }
            }
            if(answer == maxDivisor) {
                System.out.println("Correct!");
                numberOfCorrectAnswer += 1;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was" + "'" + maxDivisor + "'" + ".\n" +
                        "Let's try again, " + name);
                break;
            }
            System.out.println();

        }
        Engine.gameResult(numberOfCorrectAnswer, name);
    }

}
