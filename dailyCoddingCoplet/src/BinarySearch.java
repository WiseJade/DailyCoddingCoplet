public class BinarySearch {
    public int binarySearch(int[] arr, int target) {
        // TODO:
        int mid = arr.length / 2;
        int high = arr.length - 1;
        int low = 0;

        while(low < high) {
            if (target == arr[mid]) return mid;
            if (target == arr[high]) return high;
            if (target == arr[low]) return low;
            if (mid <= low || mid >= high) return -1;
            if (arr[mid] > target) {
                high = mid;
                mid = mid - (high - low) / 2;
            } else if (arr[mid] < target) {
                low = mid;
                mid = mid + (high - low) / 2;
            }
        }
        return -1;
    }
}
