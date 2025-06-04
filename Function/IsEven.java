package Function;

import java.util.Scanner;

public class IsEven {
    public static boolean CheckIsEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any integer");
        num = sc.nextInt();
        if(CheckIsEven(num)){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
