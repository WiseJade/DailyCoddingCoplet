import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        HeapSort h = new HeapSort();
        int[] result  = h.heapSort(new int[]{20, -10, -11, 2, 29});
        System.out.println(Arrays.toString(result));
    }
}
