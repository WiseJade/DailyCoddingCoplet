public class CompressString {
    public String compressString(String str) {
        // TODO:
        if (str.isEmpty()) return str;
        StringBuilder result = new StringBuilder();
        char previous = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            result.append(previous);
            // 이전 문자와 현재 문자가 같을 경우
            if (previous == str.charAt(i)) {
                // 문자열의 마지막 문자를 지운다
                result = result.deleteCharAt(result.length() - 1);
                // 얼마나 연속됐는지 찾기 위해 반복한다
                while (previous == str.charAt(i)) {
                    count++;
                    i++;
                    if(i == str.length()) break;
                }
                i--;
                result.append(count).append(previous);
                previous = str.charAt(i);
            } else {    // 이전 문자와 현재 문자가 다를 경우
                // 현재 문자 그대로 결과값에 붙여준다.
                result.append(str.charAt(i));
                // 중복되지 않았으므로 카운트는 1로 초기화 한다.
                count = 1;
                // 비교할 이전 문자를 현재 문자로 바꾼다.
                previous = str.charAt(i);
            }
        }
        return result.toString();
    }
}
