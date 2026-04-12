class SelectionSortDescending {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        // print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}