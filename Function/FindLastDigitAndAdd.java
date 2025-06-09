package Function;

public class FindLastDigitAndAdd {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;   
        }
        System.out.println(sum);
    }
}
