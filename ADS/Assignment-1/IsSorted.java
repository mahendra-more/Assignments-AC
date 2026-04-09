public class IsSorted {
    public static boolean isSorted(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true; // base case
        }
        if (arr[index] > arr[index + 1]) {
            return false; // violation found
        }
        return isSorted(arr, index + 1); // recursive step
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 4, 2};
        System.out.println("Array1 sorted? " + isSorted(arr1, 0));
        System.out.println("Array2 sorted? " + isSorted(arr2, 0));
    }
}
