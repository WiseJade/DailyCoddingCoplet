import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class PowerSet {
    public ArrayList<String> powerSet(String str) {
        // TODO:
        List<String> list = new ArrayList<>();

        list.add("");

        // 집합에서 중복 제거
        HashSet<Character> set = new HashSet<>();
        for (Character c : str.toCharArray()) {
            set.add(c);
        }
        str = "";
        // 중복 제거한 문자를 다시 문자열에 대입
        for (Character c : set) {
            str = str.concat(String.valueOf(c));
        }

        for (int i = 1; i <= str.length(); i++) {
            list.addAll(combination(str, i, 0, "", new ArrayList<>()));
        }
        list = (ArrayList<String>) list.stream().sorted().collect(Collectors.toList());
        return (ArrayList<String>) list;
    }

    private ArrayList<String> combination(String str, int pick, int nowIndex, String nowPick, ArrayList<String> result) {
        if (nowPick.length() == pick) {
            char[] arr = nowPick.toCharArray();
            Arrays.sort(arr);
            result.add(String.valueOf(arr));
            return result;
        }
        for (int i = nowIndex; i < str.length(); i++) {
            String picking = nowPick.concat(String.valueOf(str.charAt(i)));
            result = combination(str, pick, i + 1, picking, result);
        }
        return result;
    }
}
