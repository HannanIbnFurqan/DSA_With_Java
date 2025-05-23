package Function;

public class SwapValue{
   public static void Swap(int a, int b){
     int x = a;
     int y = b;
     int temp = x;
     y = temp;
     x = y;
     System.out.println("x = "+ a);
     System.out.println("y = "+ b);

     
   }
    public static void main(String[] arg){
          Swap(10, 20);
    }
}