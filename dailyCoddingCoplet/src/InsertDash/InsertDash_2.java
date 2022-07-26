package InsertDash;

import java.util.*;

public class InsertDash_2 {
    public String insertDash(String str) {
        if (str.length() <= 0) return null;

        char[] charArray = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char c : charArray) {
            list.add(c);
        }

        for (int i = 1; i < list.size(); i++) {
            if ((list.get(i - 1) - '0') % 2 == 1 && (list.get(i) - '0') % 2 == 1)
                list.add(i, '-');
        }
        String result = list.toString();
        result = result.replace("]", "");
        result = result.replace("[", "");
        result = result.replace(", ", "");

        return result;
    }
}
