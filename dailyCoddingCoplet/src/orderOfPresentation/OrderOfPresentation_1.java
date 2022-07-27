package orderOfPresentation;// 효율적이지 못한 알고리즘

import java.util.*;

public class OrderOfPresentation_1 {
    public int orderOfPresentation(int N, int[] K) {
        // TODO:
        ArrayList<int[]> random = permutation(N, new int[]{}, new boolean[N], new ArrayList<int[]>(), 0);

        c : for (int i = 0; i < random.size(); i++) {
            for (int j = 0; j < N; j++) {
                if (random.get(i)[j] != K[j]) {
                    continue c;
                }
                if (j == N - 1)
                    return i;
            }
        }
        return 0;
    }
    public ArrayList<int[]> permutation (int pickNum, int[] nowPick, boolean[] picked, ArrayList<int[]> list, int dept) {
        if (dept >= pickNum) {
            list.add(nowPick);
            return list;
        }
        for (int i = 0; i < pickNum; i++) {
            if (!picked[i]) {
                picked[i] = true;
                int[] picking = Arrays.copyOf(nowPick, nowPick.length + 1);
                picking[picking.length - 1] = i + 1;
                list = permutation(pickNum, picking, picked, list, dept + 1);
                picked[i] = false;
            }
        }
        return list;
    }
}
