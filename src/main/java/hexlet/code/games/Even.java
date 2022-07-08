package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String TASK = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final String[] QUESTIONS = new String[Engine.NUMBEROFROUNDS];
    private static final String[] CORRECTANSWER = new String[Engine.NUMBEROFROUNDS];

    public static void play() {
        for (int i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            int number = Engine.getRandomNumber();
            QUESTIONS[i] = String.valueOf(number);
            if (number % 2 == 0) {
                CORRECTANSWER[i] = "yes";
            } else {
                CORRECTANSWER[i] = "no";
            }
        }
        Engine.gameBody(TASK, QUESTIONS, CORRECTANSWER);
    }
}
