package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final String task = "What is the result of the expression?";
    private static final String[] questions = new String[3];
    private static final String[] correctAnswer = new String[3];

    public static void play() {
        for (int i = 0; i < 3; i++) {
            String[] operators = {"+", "-", "*"};
            int randomNumber1 = Engine.getRandomNumber();
            int randomNumber2 = Engine.getRandomNumber();
            int count = (int) (Math.random() * 2);
            questions[i] = String.format("%s %s %s", randomNumber1, operators[count], randomNumber2);
            switch (operators[count]) {
                case "+" -> correctAnswer[i] = String.valueOf(randomNumber1 + randomNumber2);
                case "-" -> correctAnswer[i] = String.valueOf(randomNumber1 - randomNumber2);
                case "*" -> correctAnswer[i] = String.valueOf(randomNumber1 * randomNumber2);
            }
        }
        Engine.gameBody(task, questions, correctAnswer);
    }
}
