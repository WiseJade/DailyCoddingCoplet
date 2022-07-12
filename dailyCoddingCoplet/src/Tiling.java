public class Tiling {
    public int tiling(int num) {
        // TODO:
        // 타일을 가로로 덮는 경우와 세로로 덮는 경우로 두 가지 경우가 있음.
        // f(1) = 1, f(2) = 2, f(3) =  3, f(4) = 5, f(5) = 8, ... 의 규칙이 있음.
        // 점화식으로 표현하면 f(n) = f(n-1) + f(n-2) 이다.
        // 효율적인 알고리즘을 위해서 재귀가 아닌 배열을 이용
        // 크기가 num인 배열 선언
        int[] arr = new int[num];
        if (num >= 1) arr[0] = 1;
        if (num >= 2) arr[1] = 2;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[num - 1];
    }
}
