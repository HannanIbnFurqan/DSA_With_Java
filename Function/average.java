package Function;

import java.util.Scanner;

public class average {
    public static int AverageNum(int x, int y, int z) {
        return (x + y + z) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number = ");
        int x = sc.nextInt();
        System.out.println("Enter second number =");
        int y = sc.nextInt();
        System.out.println("Enter third number = ");
        int z = sc.nextInt();
        System.out.println("Average of three number = " + AverageNum(x, y, z) + "\n");
        sc.close();
    }

}
