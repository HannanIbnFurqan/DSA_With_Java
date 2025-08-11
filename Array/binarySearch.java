public class binarySearch {
    public static int  BinarySearchFun(int number[], int key){
        int start = 0; 
        int end  = number.length-1;

        while (start <= end) {
            int mid = (start+end)/2;
            // comparisons
            
            if (number[mid] == key) { // mid part
                return mid;
            }else if(number[mid] < key){  // right part
                start = mid+1;
            }else{ // left part
                end =  mid-1;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,10,11,12,20,30};
        int key = 30; 

       System.out.println("index  = "+BinarySearchFun(numbers, key));
    }
}
