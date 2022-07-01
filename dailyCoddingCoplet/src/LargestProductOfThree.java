import java.util.*;

public class LargestProductOfThree {
    public int largestProductOfThree(int[] arr) {
        // TODO:
        return combinationRecursive(arr, arr[0]*arr[1]*arr[2], 0, new int[]{});
    }
    public int combinationRecursive(int[] arr, int result, int index, int[] pick) {
        // 뽑을 수를 바꾸려면 아래의 3을 원하는 숫자로 바꿔주면 된다.
        if (pick.length == 3) {
            int pickMultiply = pick[0] * pick[1] * pick[2];
            if (result < pickMultiply) {
                result = pickMultiply;
            }
            return result;
        }
        for (int i = index; i < arr.length; i++) {
            int[] pickNow = Arrays.copyOf(pick, pick.length + 1);
            pickNow[pickNow.length - 1] = arr[i];
            result = combinationRecursive(arr, result, i + 1, pickNow);
        }
        return result;
    }
}
