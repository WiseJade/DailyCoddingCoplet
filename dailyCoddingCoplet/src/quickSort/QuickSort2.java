package quickSort;
// 35번 QuickSort

import java.util.ArrayList;
import java.util.List;

public class QuickSort2 {
    public int[] quickSort(int[] arr) {
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

        int[] answer = new int[arr.length];
        List<Integer> smallNums = new ArrayList<>();
        List<Integer> bigNums = new ArrayList<>();

        int pivot = arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < pivot) {
                smallNums.add(arr[i]);
            } else bigNums.add(arr[i]);
        }
        int[] smallArr = quickSort(smallNums.stream().mapToInt(Integer::intValue).toArray());
        int[] bigArr = quickSort(bigNums.stream().mapToInt(Integer::intValue).toArray());
        System.arraycopy(smallArr, 0, answer, 0, smallArr.length);
        answer[smallArr.length] = pivot;
        System.arraycopy(bigArr, 0, answer, smallArr.length + 1, bigArr.length);
        return answer;
    }
}
