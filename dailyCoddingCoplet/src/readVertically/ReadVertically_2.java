package readVertically;

public class ReadVertically_2 {
    public String readVertically(String[] arr) {
        // TODO:

        String result = "";

        boolean isPresent = false;

        // 밖의 for문 : charAt으로 String의 인덱스에 접근 (0~무한-breakPoint)
        for (int i = 0; ; i++) {
            // 안의 for문 : arr의 요소만큼 반복
            for (int j = 0; j < arr.length; j++) {
                // 붙이는 조건 : arr의 j번째 요소의 길이가 i보다 커야됨
                if (arr[j].length() > i) {
                    // arr의 j번째 요소의 i번째 char를 result에 복사
                    result += String.valueOf(arr[j].charAt(i));
                    isPresent = true;
                }
            }
            if (!isPresent) {
                break;
            }
            isPresent = false;
        }
        return result;
    }
}
