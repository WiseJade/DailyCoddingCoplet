public class CompressString {
    public String compressString(String str) {
        // TODO:
        if (str.isEmpty()) return str;
        StringBuilder result = new StringBuilder();
        char previous = str.charAt(0);
        int count = 1;
        result.append(previous);
        for (int i = 1; i < str.length(); i++) {
            // 이전 문자와 현재 문자가 같을 경우
            if (previous == str.charAt(i)) {
                // 문자열의 마지막 문자를 지운다
                result.deleteCharAt(result.length() - 1);
                // 몇 번 연속됐는지 찾기 위해 반복한다
                do {
                    count++;
                    i++;
                    if (i >= str.length() - 1) break;
                }
                while (previous == str.charAt(i));
                // 연속되는 숫자가 3개 이상일 경우
                if (count >= 3) {
                    // 연속되는 개수와 문자 붙인다.
                    result.append(count).append(previous);

                } else {    // 연속되는 숫자가 2개일 경우
                    // 문자만 2개 붙인다.
                    result.append(previous).append(previous);
                }
                // 마지막 인덱스가 아닐경우
                if (i <= str.length() - 1) {
                    // 이전 문자를 현재 문자로 바꾸고 문자를 결과값에 붙인다.
                    previous = str.charAt(i);
                    result.append(previous);
                }
                // 카운트 1로 초기화
                count = 1;
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
