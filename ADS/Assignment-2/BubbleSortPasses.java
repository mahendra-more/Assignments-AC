class BubbleSortPasses {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Bubble sort pass
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            // Print array after each pass
            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}