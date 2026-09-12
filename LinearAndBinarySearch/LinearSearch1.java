package LinearAndBinarySearch;

public class LinearSearch1 {

    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, -5, 30, -8};

        int result = findFirstNegative(arr);

        System.out.println("Index of first negative number: " + result);
    }
}