package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final String[] QUESTIONS = new String[Engine.NUMBEROFROUNDS];
    private static final String[] CORRECTANSWER = new String[Engine.NUMBEROFROUNDS];

    public static void play() {
        for (int i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            int randomNumber = Engine.getRandomNumber();
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
