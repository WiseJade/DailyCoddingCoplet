public class ComputeSquareRoot {
    public String computeSquareRoot(int num) {
        // TODO:
        double square = 0;
        // 정수 부분 확인
        for (int i = 1; i < num; i++) {
            if(Math.pow(i, 2) <= num && Math.pow(i+1, 2) > num) {
                square = i;
                if(square * square == num)
                    return String.format("%.2f", square);
                break;
            }
        }
        // 소수점 첫번쨰 자리 확인
        for (int i = 0; i <= 9; i++) {
            if(Math.pow(square + 0.1 * i, 2) <= num && Math.pow(square + 0.1 * (i+1), 2) > num) {
                square += 0.1 * i;
                if(square * square == num)
                    return String.format("%.2f", square);
            }
        }
        // 소수점 둘째 자리 확인
        for (int i = 0; i <= 9; i++) {
            if(Math.pow(square + 0.01 * i, 2) <= num && Math.pow(square + 0.01 * (i+1), 2) > num) {
                square += 0.01 * i;
                if(square * square == num)
                    return String.format("%.2f", square);
            }
        }
        // 소수점 셋째 자리 확인
        for (int i = 0; i <= 9; i++) {
            if(Math.pow(square + 0.001 * i, 2) <= num && Math.pow(square + 0.001 * (i+1), 2) > num) {
                square += 0.001 * i;
            }
        }
        return String.format("%.2f", square);
    }
}
