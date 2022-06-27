package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        // TODO:
        // 재귀 호출 후 반환
        int temp;
        if (arr.length < 2) return arr;
        int[] result = new int[arr.length];
        // 현재 값과 다음 값비교하기 때문에 길이 - 1만큼 반복
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // 자리 바꿈
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        // 배열의 맨 끝 요소를 잘라서 재귀함수 매개변수에 넣는다
        int[] tempArr = bubbleSort(Arrays.copyOf(arr, arr.length - 1));
        // result 배열에 재귀함수 호출한 배열을 넣고 반환한다.
        result[result.length - 1] = arr[arr.length - 1];
        System.arraycopy(tempArr, 0, result, 0, tempArr.length);
        return result;
    }
}