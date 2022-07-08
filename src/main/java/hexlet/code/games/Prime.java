package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final String[] questions = new String[3];
    private static final String[] correctAnswer = new String[3];

    public static void play() {
        for (int i = 0; i < 3; i++) {
            int randomNumber = Engine.getRandomNumber();
            questions[i] = String.valueOf(randomNumber);
            if (randomNumber == 1) {
                correctAnswer[i] = "no";
            }
            for(int n = 2; n < randomNumber; n++) {
                if (randomNumber % n != 0) {
                    correctAnswer[i] = "yes";
                } else {
                    correctAnswer[i] = "no";
                    break;
                }
            }
        }
        Engine.gameBody(task, questions, correctAnswer);
    }
}
