package Function;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int originalNum = num;
        int reversed = 0;
        while (num > 0) {
           int lastDigit = num % 10;
           reversed = reversed * 10 + lastDigit;
            num = num / 10;
        }

        if (originalNum == reversed) {
             System.out.println("Number is Palindrom = "+ reversed);
        }else{
            System.out.println("Number is not palindrom = "+ reversed);
        }

    }
}
