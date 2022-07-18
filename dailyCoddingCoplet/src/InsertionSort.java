public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        // TODO:
        // 배열의 1번 인덱스부터 배열의 끝까지 반복한다.
        for (int i = 1; i < arr.length; i++) {
            // 비교를 위해 i번째 인덱스 값을 변수에 저장한다.
            int now = arr[i];
            // 배열의 i-1 부터 0까지 반복한다.
            for (int j = i - 1; j >= 0; j--) {
                // 만약에 j번째 값 > 현재값 이면 j번째 값을 한 칸 뒤로 옮긴다.
                if (arr[j] > now) {
                    arr[j + 1] = arr[j];
                } else { // j번쨰 값 <= 현재값 이면 현재값을 저장하고 반복을 멈춘다.
                    arr[j + 1] = now;
                    break;
                }
                if (j == 0) { // 0번째 인덱스에 도달하면 현재값을 저장한다.
                    arr[j] = now;
                }
            }
        }

        return arr;
    }
}
