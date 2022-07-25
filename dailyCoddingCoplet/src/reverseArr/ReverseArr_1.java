package reverseArr;

import java.util.*;

public class ReverseArr_1 {
    public class Solution {

        public int[] reverseArr(int[] arr) {
            // TODO:
            if (arr.length == 0 || arr.length == 1) return arr;
            int[] result = new int[arr.length];
            result[0] = arr[arr.length - 1];
            result[result.length - 1] = arr[0];
            System.arraycopy(reverseArr(Arrays.copyOfRange(arr, 1, arr.length - 1)), 0, result, 1, result.length - 2);
            return result;
        }
    }
}
