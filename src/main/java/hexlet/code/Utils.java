package hexlet.code;

public class Utils {

    public static int getRandomNumber(int minRandomNumber, int maxRandomNumber) {
        //формируем число от 1 до 100
        return minRandomNumber + (int) (Math.random() * maxRandomNumber);
    }
}
