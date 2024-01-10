import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String value = "ВП КЧ 3Т 1Т ВТ";
        String[] cards = value.split(" ");

        System.out.println(Arrays.toString(cards));
    }
}
