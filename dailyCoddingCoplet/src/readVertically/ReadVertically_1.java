package readVertically;

public class ReadVertically_1 {
    public String readVertically(String[] arr) {
        // TODO:
        String result = "";
        int maxLangth = 0;
        for(int i = 0; i < arr.length; i++) {
            maxLangth = Math.max(maxLangth, arr[i].length());
        }
        for(int i = 0 ; i < maxLangth; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[j].length() > i)
                    result = result.concat(String.valueOf(arr[j].charAt(i)));
            }
        }
        return result;
    }
}
