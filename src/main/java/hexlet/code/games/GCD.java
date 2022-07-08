package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final String task = "Find the greatest common divisor of given numbers.\n";
    private static final String[] questions = new String[3];
    private static final String[] correctAnswer = new String[3];
    public static void play() {

        for(int i = 0; i < 3; i++) {
            //выводим число в диапазоне от 1 до 100
            int randomNumber1 = Engine.getRandomNumber();
            int randomNumber2 = Engine.getRandomNumber();
            int maxDivisor = Math.min(randomNumber1, randomNumber2);
            questions[i] = String.format("%s %s", randomNumber1, randomNumber2);
            for(int n = maxDivisor; n >= 1; n--) {
                if(randomNumber1 % n == 0 && randomNumber2 % n == 0) {
                    correctAnswer[i] = String.valueOf(n);
                    break;
                }
            }
        }
        Engine.gameBody(task, questions, correctAnswer);
    }

}
