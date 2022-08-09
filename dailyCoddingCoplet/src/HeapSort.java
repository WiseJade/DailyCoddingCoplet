import java.util.PriorityQueue;

public class HeapSort {
    public int[] heapSort(int[] arr) {
        // TODO:
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] resultArr = new int[arr.length];
        for (int num : arr) {
            queue.add(num);
        }
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            resultArr[i] = queue.poll();
        }
        return resultArr;
    }
}
