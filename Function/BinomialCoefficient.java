package Function;

public class BinomialCoefficient {
    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int BinF(int n, int r) {
        if (r > n || n < 0 || r < 0)
            return -1;
        int n_fact = Factorial(n);
        int r_fact = Factorial(r);
        int nmr_fact = Factorial(n - r);
        int BinF = n_fact / (r_fact * nmr_fact);
        return BinF;
    }

    public static void main(String[] arg) {
        int result = BinF(2, 5);
        if (result == -1) {
            System.out.println("inValid input give me  valid input ");
        } else {
            System.out.println(result);
        }

    }
}
