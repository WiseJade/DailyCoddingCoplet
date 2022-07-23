import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PowerSet {
    public ArrayList<String> powerSet(String str) {
        // TODO:
        List<String> list = new ArrayList<>();

        list.add("");

        // 집합에서 중복 제거
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(0, i).contains(String.valueOf(str.charAt(i)))) {
                
            }
        }

        for (int i = 1; i < str.length(); i++) {
            list.addAll(combination(str, i, 0, "", new ArrayList<>()));
        }
        list = (ArrayList<String>) list.stream().sorted().collect(Collectors.toList());
        return (ArrayList<String>) list;
    }

    private ArrayList<String> combination(String str, int pick, int nowIndex, String nowPick, ArrayList<String> result) {
        if (nowPick.length() == pick) {
            result.add(nowPick);
            return result;
        }
        for (int i = nowIndex; i < str.length(); i++) {
            nowPick = nowPick.concat(String.valueOf(str.charAt(i)));
            result = combination(str, pick, i + 1, nowPick, result);
            nowPick = "";
        }
        return result;
    }
}
