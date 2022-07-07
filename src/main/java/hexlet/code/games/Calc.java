package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void play() {
        String name = Engine.getPlayerName();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?\n");
        int numberOfCorrectAnswer = 0;
        for(int i = 0; i < 3; i++) {
            String[] operators = {"+", "-", "*"};
            int count = (int) (Math.random() * 2);
            //выводим число в диапазоне от 1 до 100
            int x = 1 + (int) (Math.random() * 100);
            int y = 1 + (int) (Math.random() * 100);
            System.out.println("Question: " + x + operators[count] + y);
            int answer = Engine.getAnswerInt();
            int result = 0;
            switch (operators[count]) {
                case "+" -> result = x + y;
                case "-" -> result = x - y;
                case "*" -> result = x * y;
            }
            if(answer == result) {
                System.out.println("Correct!");
                numberOfCorrectAnswer += 1;
                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was" + "'" + result + "'" + ".\n" +
                            "Let's try again, " + name);
                    break;
                }
            System.out.println();

        }
        if(numberOfCorrectAnswer >= 3) {
            System.out.println("Congratulations, " + name);
        }    }

}
