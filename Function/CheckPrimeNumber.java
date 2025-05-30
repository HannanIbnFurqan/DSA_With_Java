package Function;

public class CheckPrimeNumber {
    public static boolean CheckPrime(int n) {
        if(n == 2){
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
               isPrime = false;
            }
           
        }
         return isPrime;

    }

    public static void main(String[] args) {
      boolean result =  CheckPrime(5);
      System.out.println(result);

    }
}
