public class BinarySearchSpaceComplexity {
//auxiliary space complexity is O(1).

    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {0, 2, 3, 4, 8, 61};
        int target = 4;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        System.out.println("Auxiliary Space Complexity: O(1)");
    }
}