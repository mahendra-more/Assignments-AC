class InsertIntoSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 0}; // extra space
        int n = 4; // current elements
        int key = 4;

        int i = n - 1;

        // shift elements
        while (i >= 0 && arr[i] > key) {
            arr[i + 1] = arr[i];
            i--;
        }

        arr[i + 1] = key;

        // print result
        for (int j = 0; j < n + 1; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}