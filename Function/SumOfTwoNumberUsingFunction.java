package Function;

import java.util.Scanner;

public class SumOfTwoNumberUsingFunction {
    public static void Calculate(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculate(a, b);
    }
    
}
