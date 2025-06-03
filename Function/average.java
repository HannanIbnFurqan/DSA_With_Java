package Function;

public class average {

    public static void averageNum(int a, int b, int c) {

        int result = a + b + c;

        int average = result / 3;
        System.out.print(average);
    }

    public static void main(String[] args) {
        averageNum(5, 10, 15);
    }
}
