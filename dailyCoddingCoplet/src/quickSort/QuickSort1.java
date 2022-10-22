package quickSort;

import java.util.Arrays;

public class QuickSort1 {
    public int[] quickSort(int[] arr) {
        // TODO:
        if (arr.length <= 1) {
            return arr;
        }
        if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                int a = arr[0];
                arr[0] = arr[1];
                arr[1] = a;
            }
            return arr;
        }
        int pivot = arr[0];
        int low = 1;
        int high = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (low > high) {
                break;
            }
            if (arr[low] > arr[high]) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
            if (arr[low] < pivot) {
                low++;
            }
            if (arr[high] > pivot) {
                high--;
            }
        }
        arr[0] = arr[high];
        arr[high] = pivot;
        int[] part1 = quickSort(Arrays.copyOfRange(arr, 0, high));
        int[] part2 = quickSort(Arrays.copyOfRange(arr, low, arr.length));
        System.arraycopy(part1, 0, arr, 0, part1.length);
        System.arraycopy(part2, 0, arr, part1.length + 1, part2.length);
        return arr;
    }
}
