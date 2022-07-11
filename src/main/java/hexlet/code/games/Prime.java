package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final String[] QUESTIONS = new String[Engine.NUMBEROFROUNDS];
    private static final String[] CORRECTANSWER = new String[Engine.NUMBEROFROUNDS];
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void play() {
        for (int i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            int randomNumber = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            QUESTIONS[i] = String.valueOf(randomNumber);
            //условие на случай, если выпадет 1
            if (randomNumber == 1) {
                CORRECTANSWER[i] = "no";
            }
            for (int n = 2; n < randomNumber; n++) {
                if (randomNumber % n != 0) {
                    CORRECTANSWER[i] = "yes";
                } else {
                    CORRECTANSWER[i] = "no";
                    break;
                }
            }
        }
        Engine.runGame(TASK, QUESTIONS, CORRECTANSWER);
    }
}
