// 효율적인 순열 순서 알고리즘
package orderOfPresentation;

import java.util.Arrays;

public class OrderOfPresentation_2 {
    public int orderOfPresentation(int N, int[] K) {
        // TODO:
        int order = 0;

        boolean[] isUsed = new boolean[N + 1];

        int notUsedCount = 0;

        for (int i = 0; i < K.length; i++) {
            for (boolean validate : Arrays.copyOfRange(isUsed, 0, K[i])) {
                if (!validate)
                    notUsedCount++;
            }
            order += factorial(N - i - 1) * (notUsedCount - 1);
            isUsed[K[i]] = true;
            notUsedCount = 0;
        }
        return order;
    }
    public int factorial (int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
