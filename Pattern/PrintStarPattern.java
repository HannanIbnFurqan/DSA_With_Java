package Pattern;

public class PrintStarPattern {
    public static void main(String[] args) {
        for(int line = 1; line <= 5; line++){
            for(int j = 1; j <= line; j++){
                System.out.print("**");
            }
            System.out.println("");
        }
    }
    
}
