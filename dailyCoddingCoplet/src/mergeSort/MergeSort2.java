package mergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeSort2 {
    public int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
            return arr;
        }
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, arr.length / 2));
        int[] right = mergeSort(Arrays.copyOfRange(arr, arr.length / 2, arr.length));

        System.arraycopy(left, 0, arr, 0, left.length);
        System.arraycopy(right, 0, arr, left.length, right.length);
        int idx;
        List<Integer> result = new LinkedList<>();
        for (int temp : left) {
            result.add(temp);
        }
        for (int temp : right) {
            idx = 0;
            while (idx < result.size() && result.get(idx) < temp) {
                idx++;
            }
            result.add(idx, temp);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
