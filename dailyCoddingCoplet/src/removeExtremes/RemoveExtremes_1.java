package removeExtremes;

import java.util.*;

public class RemoveExtremes_1 {
    public String[] removeExtremes(String[] arr) {
        // TODO:
        if(arr.length == 0) return null;
        int maxIndex = 0;
        int maxLength = arr[0].length();
        int minIndex = 0;
        int minLength = arr[0].length();
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        for(int i = 0; i < list.size(); i++) {
            if(maxLength <= list.get(i).length()) {
                maxIndex = i;
                maxLength = list.get(i).length();
            }

        }
        list.remove(maxIndex);
        for(int i = 0; i < list.size(); i++) {
            if (minLength >= list.get(i).length()) {
                minIndex = i;
                minLength = list.get(i).length();
            }
        }
        list.remove(minIndex);
        return list.toArray(new String[list.size()]);
    }
}
