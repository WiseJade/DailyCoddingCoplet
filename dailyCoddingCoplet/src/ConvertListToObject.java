import java.util.*;

public class ConvertListToObject {
    public HashMap<String, String> convertListToHashMap(String[][] arr) {
        // TODO:
        // 결과로 리턴할 hashmap
        HashMap<String, String> map = new HashMap<>();
        // 빈 배열을 입력받은 경우 빈 hashmap 리턴
        if (arr.length == 0) return map;
        // 배열의 행 개수만큼 반복
        for (int i = 0; i < arr.length; i++) {
            // value로 쓸 값이 비어있는 경우(arr[i]의 길이가 0인 경우)
            if (arr[i].length == 0) {
                // 반복문 처음으로 돌아가서 다음 행 확인
                continue;
            }
            // value로 쓸 값이 있을 경우
            // key값이 map에 중복되는지 확인
            if (map.containsKey(arr[i][0])) {
                // 중복될 경우 추가하지 않음
                continue;
            }
            // 중복되지 않을 경우
            // map에 key와 value 추가
            map.put(arr[i][0], arr[i][1]);
        }
        return map;
    }
}
