package Function;

public class Factorial {
    public static int findFactorial(int n) {
        if( n < 0){
            return -1;
        }
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {  
        int f = findFactorial(-5);
        if (f == -1) {
            System.out.println("Factorial not defind for negative number");
        }else{
          System.out.println(f);
        }
          
    }
}
