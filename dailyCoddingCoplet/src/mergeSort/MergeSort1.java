package mergeSort;

import java.util.Arrays;

public class MergeSort1 {
    public int[] mergeSort(int[] arr) {
        // TODO :
        if (arr.length < 2) {
            return arr;
        }
        int middle = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);
        left = mergeSort(left);
        right = mergeSort(right);
        int[] result = new int[left.length + right.length];
        int leftIdx = 0;
        int rightIdx = 0;
        for (int i = 0; i < result.length; i++) {
            if (leftIdx >= left.length) {
                System.arraycopy(right, rightIdx, result, i, right.length - rightIdx);
                break;
            } else if (rightIdx >= right.length) {
                System.arraycopy(left, leftIdx, result, i, left.length - leftIdx);
                break;
            } else if(left[leftIdx] > right[rightIdx]) {
                result[i] = right[rightIdx];
                rightIdx++;
            } else {
                result[i] = left[leftIdx];
                leftIdx++;
            }
        }
        return result;
    }
}
