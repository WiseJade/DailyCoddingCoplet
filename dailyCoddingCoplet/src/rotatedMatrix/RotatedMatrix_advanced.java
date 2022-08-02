package rotatedMatrix;

public class RotatedMatrix_advanced {
    public int[][] rotateMatrix(int[][] matrix, int K) {
        // TODO:
        // 빈 배열 입력받았거나 회전하고 제자리로 돌아오는 경우 matrix 그대로 리턴
        if (matrix == null || K % 4 == 0)
            return matrix;
        // 90도 씩 K번 회전한 결과는 K를 4로 나눈 수만큼 회전한 결과와 같다. -> 주기 4
        int rotationCount = K % 4;
        // matrix의 세로 마지막 인덱스 변수 N에 저장
        int N = matrix.length - 1;
        // matrix의 가로 마지막 인덱스 변수 M에 저장
        int M = matrix[0].length - 1;
        // 회전한 결과를 담을 배열 선언
        int[][] result;
        // 만약 회전수가 짝수일 경우
        if(rotationCount % 2 == 0) {
            // 결과배열 크기 N*M
            result = new int[N + 1][M + 1];
        } else {    // 회전수가 홀수일 경우
            // 결과배열 크기 M*N
            result = new int[M + 1][N + 1];
        }
        // result의 세로 개수가 가변하지 않으므로 임시로 인덱스를 담을 변수 선언
        int vertical = 0;
        int width = 0;
        // matrix의 모든 요소를 순회한다.
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                // 세로 인덱스를 i, 가로 인덱스를 j로 초기화 시켜준다.
                vertical = i;
                width = j;
                N = matrix.length - 1;
                M = matrix[0].length - 1;
                // ratationCount만큼 반복한다.
                for (int r = 0; r < rotationCount; r++) {
                    // 임시 가로세로 인덱스 변수를 계산한다.
                    int temp = vertical;
                    vertical = width;
                    width = N - temp;
                    // 한번 회전했으므로 가로세로 마지막 인덱스를 바꿔준다.
                    temp = N;
                    N = M;
                    M = temp;
                }
                // 회전이 끝나면 결과 배열에 넣는다.
                result[vertical][width] = matrix[i][j];
            }
        }
        return result;
    }
}
