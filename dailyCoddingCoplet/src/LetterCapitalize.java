public class LetterCapitalize {
    public String letterCapitalize(String str) {
        // TODO:
        // 빈 문자열은 그대로 리턴
        if (str.length() == 0) return str;
        // 공백을 기준으로 문자열을 잘라서 문자열 배열에 넣는다
        String[] arr = str.split(" ");
        // 결과값을 담을 문자열을 초기화
        String result = "";
        // 문자열 배열을 모두 조사
        for (String s : arr) {
            if (s.equals("")) {
                result = result.concat(" ");
                continue;
            }

            // 첫 글자를 잘라서 대문자로 변환 후 결과 문자열에 붙인다
            result = result.concat(s.substring(0, 1).toUpperCase());
            // 첫 글자를 제외한 나머지 글자를 잘라서 결과 문자열에 붙인다
            result = result.concat(s.substring(1, s.length()));
            // 단어 하나가 끝나면 whiteSpace를 결과 문자열에 붙인다

            if (s != arr[arr.length - 1])
                result = result.concat(" ");
        }
        return result;
    }
}
