class OptimizedBubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; // already sorted
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // if no swap → stop early
            if (!swapped) {
                System.out.println("Array already sorted. Stopping early.");
                break;
            }
        }

        // print final array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}