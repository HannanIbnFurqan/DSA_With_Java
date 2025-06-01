package Function;

public class PrimeInRange {
    public static boolean CheckPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void CheckRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (CheckPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        CheckRange(10);
    }
}
