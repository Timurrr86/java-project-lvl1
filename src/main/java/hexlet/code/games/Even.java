package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String task = "Answer 'yes' if number even otherwise answer 'no'.\n";
    private static final String[] questions = new String[3];
    private static final String[] correctAnswer = new String[3];

    public static void play() {
        for (int i = 0; i < 3; i++) {
            int number = Engine.getRandomNumber();
            questions[i] = String.valueOf(number);
        if (number % 2 == 0) {
            correctAnswer[i] = "yes";
        } else {
            correctAnswer[i] = "no";
        }
        }
        Engine.gameBody(task, questions, correctAnswer);
    }
    }
