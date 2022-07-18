package hexlet.code;

public class Utils {

    public static int getRandomNumber(int minRandomNumber, int maxRandomNumber) {
        return minRandomNumber + (int) (Math.random() * maxRandomNumber);
    }
}
