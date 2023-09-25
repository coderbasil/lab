public class Sorter {
    
        public static void selectionSort(int[] arr) {
            int n = arr.length;
    
            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in the unsorted array
                int minIdx = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIdx]) {
                        minIdx = j;
                    }
                }
    
                // Swap the found minimum element with the first element of the subarray
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};
            selectionSort(arr);
            System.out.println("Sorted array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

}