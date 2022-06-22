import java.util.Arrays;
import java.util.HashMap;

class TransformFirstAndLast {
    public HashMap<String, String> transformFirstAndLast(String[] arr) {
        // TODO:
        if (arr.length == 0) {
            return null;
        }
        HashMap<String, String> result = new HashMap<String, String>();
        result.put(arr[0], arr[arr.length - 1]);
        return result;
    }
}
