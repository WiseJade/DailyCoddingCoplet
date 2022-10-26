import mergeSort.MergeSort2;
import quickSort.QuickSort2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        QuickSort2 quick = new QuickSort2();
        int[] arr = {20, -10, -11, 2,1,10,20,30,40,5060,54095};
        System.out.println(Arrays.toString(quick.quickSort(arr)));
        MergeSort2 merge = new MergeSort2();
        System.out.println(Arrays.toString(merge.mergeSort(new int[]{20, -10, -11, 2, 29})));
    }
}
