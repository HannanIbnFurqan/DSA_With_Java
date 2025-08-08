public class linearSearch {
    public static int checkIndex(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        int key = 50;

        int index = checkIndex(numbers, key);

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Index is = " + index);
        }
    }
}
