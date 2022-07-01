import java.util.*;

public class RemoveExtremes {
    public String[] removeExtremes(String[] arr) {
        // TODO:
        if(arr.length == 0) return null;
        int index = 0;
        int size = 0;
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        // 가장 큰 길이의 배열 지우기
        for(int i = 0; i < list.size(); i++) {
            if(size <= list.get(i).length()) {
                index = i;
                size = list.get(i).length();
            }
        }
        list.remove(index);
        index = 0;
        size = list.get(0).length();
        // 가장 작은 길이의 배열 지우기
        for(int i = 0; i < list.size(); i++) {
            if(size >= list.get(i).length()) {
                index = i;
                size = list.get(i).length();
            }
        }
        list.remove(index);
        String[] result = list.toArray(new String[list.size()]);
        return result;
    }
}
