package bubbleSort;

public class BubbleSort_1 {
    public int[] bubbleSort(int[] arr) {
        // TODO:
        int count = 0;
        for (int i = 1; i <= arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
            if (count == 0) {
                return arr;
            }
            count = 0;
        }
        return arr;
    }
}
