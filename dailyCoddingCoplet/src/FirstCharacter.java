import java.util.*;

public class FirstCharacter {
    public String firstCharacter(String str) {
        // TODO:
        // 리턴할 변수 result 빈 문자열로 초기화
        String result = "";

        // 예외 처리 : str이 빈 문자열인 경우 result 반환
        if(str.isEmpty()) return result;
        // 빈 문자열이 아닐 경우 str의 첫문자 concat
        result = result.concat(String.valueOf(str.charAt(0)));
        // 문자열 길이동안 반복
        // 공백 다음 문자(단어의 첫 글자) concat
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                result = result.concat(String.valueOf(str.charAt(i+1)));
            }
        }
        return result;
    }
}
