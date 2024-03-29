package mergeSort;

import java.util.Arrays;

public class MergeSort1 {
    public int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int middle = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, middle));
        int[] right = mergeSort(Arrays.copyOfRange(arr, middle, arr.length));

        arr = new int[left.length + right.length];
        int leftIdx = 0;
        int rightIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (leftIdx >= left.length) {
                System.arraycopy(right, rightIdx, arr, i, right.length - rightIdx);
                break;
            } else if (rightIdx >= right.length) {
                System.arraycopy(left, leftIdx, arr, i, left.length - leftIdx);
                break;
            } else if(left[leftIdx] > right[rightIdx]) {
                arr[i] = right[rightIdx];
                rightIdx++;
            } else {
                arr[i] = left[leftIdx];
                leftIdx++;
            }
        }
        return arr;
    }
}
