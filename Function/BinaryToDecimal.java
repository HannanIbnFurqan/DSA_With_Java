package Function;

public class BinaryToDecimal {
    public static void BinTODec(int BinNum) {
        int pow = 0;
        int dec = 0;
        while (BinNum > 0) {
            System.out.println("Bin = "+ BinNum);
            int lastDigit = BinNum % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            BinNum = BinNum / 10;

        }
        System.out.println(dec);
    }

    public static void main(String[] args) {
             BinTODec(101);
    }

}
