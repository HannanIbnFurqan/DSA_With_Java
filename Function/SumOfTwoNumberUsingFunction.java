package Function;

import java.util.Scanner;

public class SumOfTwoNumberUsingFunction {

    // Function to calculate and print sum
    public static void Calculate(int a, int b){
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Call function
        Calculate(a, b);

        sc.close(); // Good practice to close the scanner
    }
}
