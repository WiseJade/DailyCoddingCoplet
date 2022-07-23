package removeExtremes;

public class RemoveExtremes_2 {
    public String[] removeExtremes(String[] arr) {
        // 문자열 배열의 길이가 0일 경우 null 리턴
        if(arr.length <= 0) return null;

        // 가장 짧은 문자열 길이, 인덱스를 담을 변수 선언
        int minLength = arr[0].length();
        int minIndex = 0;

        // 가장 긴 문자열 길이, 인덱스를 담을 변수 선언
        int maxLength = arr[0].length();
        int maxIndex = 0;

        // 결과값을 담을 배열을 선언(길이 : arr의 길이 - 2)
        String[] result = new String[arr.length - 2];


        // 문자열 배열의 길이만큼 반복한다
        for (int i = 0; i < arr.length; i++) {
            // i번째 문자열 길이가 maxlength 보다 걑거나 클 경우
            if (arr[i].length() >= maxLength) {
                // maxlength에 i번째 문자열의 길이를 넣는다.
                maxLength = arr[i].length();
                // 최댓값 인덱스에 i를 담는다.
                maxIndex = i;
            }
            // i번째 문자열 길이가 minlength 보다 같거나 작을 경우
            if (arr[i].length() <= minLength) {
                // minlength에 i번째 문자열의 길이를 넣는다.
                minLength = arr[i].length();
                // 최솟값 인덱스에 i를 담는다.
                minIndex = i;
            }
        }

        int j = 0;
        // 결과 문자열 배열에 요소를 넣기 위해 문자열 배열의 길이만큼 반복한다
        for (int i = 0; i < arr.length; i++) {
            if (i == maxIndex || i == minIndex) {
                continue;
            }
            result[j] = arr[i];
            j++;
        }
        return result;
    }
}
