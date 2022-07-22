import java.util.ArrayList;

public class PowerSet {
    public ArrayList<String> powerSet(String str) {
        // TODO:
        ArrayList<String> list = new ArrayList<>();

        list.add("");

        for (int i = 1; i <= str.length(); i++) {
            list.addAll(combination(str, i, 0, "", new ArrayList<>()));
        }

        return list;
    }

    private ArrayList<String> combination(String str, int pick, int nowIndex, String nowPick, ArrayList<String> result) {
        if (nowPick.length() == pick) {
            result.add(nowPick);
            return result;
        }
        for (int i = nowIndex; i < str.length(); i++) {
            nowPick.concat(String.valueOf(str.charAt(i)));
            result.addAll(combination(str, pick, nowIndex + 1, nowPick, result));
            nowPick = "";
        }
        return result;
    }
}
