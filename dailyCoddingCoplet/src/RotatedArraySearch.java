public class RotatedArraySearch {
    public int rotatedArraySearch(int[] rotated, int target) {
        // TODO:
        int pivot = findPivot(rotated, 0, rotated.length - 1);

        if (pivot == - 1)
            return binarySearch(rotated, 0, rotated.length - 1, target);

        if (rotated[pivot] == target)
            return pivot;
        if (rotated[0] <= target) {
            return binarySearch(rotated, 0, pivot - 1, target);
        }
        return binarySearch(rotated, pivot + 1, rotated.length - 1, target);
    }
    public int findPivot(int arr[], int low, int high) {
        if (high < low)
            return -1;
        if (high == low)
            return low;

        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return mid - 1;
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }
    public int binarySearch(int[] arr, int low, int high, int target) {
        if (high < low)
            return -1;

        int mid = (low + high) / 2;
        if (arr[mid] == target)
            return mid;
        if(target > arr[mid])
            return binarySearch(arr, mid + 1, high, target);
        return binarySearch(arr, low, mid - 1, target);
    }
}
