public class RadixSort {
    public int[] radixSort(int[] arr) {
        // TODO:
        int MAX = 1;
        // 배열 요소값의 최댓값 찾기
        for (int i = 0; i < arr.length; i++) {
            MAX = Math.max(MAX, arr[i]);
        }
        MAX++;
        int[] countArr = new int[MAX];
        int[] sumArr = new int[MAX];
        int[] resultArr = new int[arr.length];
        // 배열의 요소 값 카운트
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }
        // 요소의 합 누적계산
        sumArr[0] = countArr[0];
        for (int i = 1; i < countArr.length; i++) {
            sumArr[i] = sumArr[i - 1] + countArr[i];
        }
        // 누적된 합 배열을 바탕으로 정렬
        for (int i = arr.length - 1; i >= 0; i--) {
            resultArr[sumArr[arr[i]] - 1] = arr[i];
            sumArr[arr[i]]--;
        }
        return resultArr;
    }
}
