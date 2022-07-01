public class SuperIncreasing {
    public boolean superIncreasing(int[] arr) {
        // TODO:
        int sum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(sum >= arr[i]) {
                return false;
            }
            sum += arr[i];
        }
        return true;
    }
}
