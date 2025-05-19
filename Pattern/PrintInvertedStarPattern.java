package Pattern;

public class PrintInvertedStarPattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-1+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
