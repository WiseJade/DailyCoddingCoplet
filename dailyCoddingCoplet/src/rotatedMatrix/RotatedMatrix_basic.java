package rotatedMatrix;

public class RotatedMatrix_basic {
    public int[][] rotateMatrix(int[][] matrix, int K) {
        // TODO:
        // 빈 배열 입력받았거나 회전하고 제자리로 돌아오는 경우 matrix 그대로 리턴
        if (matrix == null || K % 4 == 0)
            return matrix;
        // 90도 씩 K번 회전한 결과는 K를 4로 나눈 수만큼 회전한 결과와 같다. -> 주기 4
        int rotationCount = K % 4;
        // matrix의 세로 마지막 인덱스 변수 N에 저장
        int N = matrix.length - 1;
        // 회전한 결과를 담을 배열 선언 (가로세로 크기 N)
        int[][] result = new int[N+1][N+1];
        // matrix의 모든 요소를 순회한다.
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                // ratationCount만큼 반복한다.
                for (int m = 0; m < rotationCount; m++) {
                    // result[j][N-i] = matrix[i][j] 이다.
                    result[j][N-i] = matrix[i][j];
                }
            }
        }
        return result;
    }
}
