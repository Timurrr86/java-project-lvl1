package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String TASK = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final String[] QUESTIONS = new String[Engine.NUMBEROFROUNDS];
    private static final String[] CORRECTANSWER = new String[Engine.NUMBEROFROUNDS];
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void launchGame() {
        for (int i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            int number = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            QUESTIONS[i] = String.valueOf(number);
            if (number % 2 == 0) {
                CORRECTANSWER[i] = "yes";
            } else {
                CORRECTANSWER[i] = "no";
            }
        }
        Engine.runGame(TASK, QUESTIONS, CORRECTANSWER);
    }
}
