package largestProductOfThree;

public class NestedFor {
    public int largestProductOfThree(int[] arr) {
        // TODO:
        int result = arr[0] * arr[1] * arr[2];
        int nowMultipl;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    nowMultipl = arr[i] * arr[j] * arr[k];
                    if (result < nowMultipl) {
                        result = nowMultipl;
                    }
                }
            }
        }
        return result;
    }
}