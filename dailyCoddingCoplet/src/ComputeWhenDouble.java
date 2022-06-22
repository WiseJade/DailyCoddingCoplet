public class ComputeWhenDouble {
    public int computeWhenDouble(double interestRate) {
        // TODO:
        // 반환값(결과값) 걸리는 시간(년)
        int year = 0;

        // 원금이 2배 이상이 될 때까지 걸리는 시간 계산
        for (double mon = 1000; mon < 2000; year++) {
            // 1년 후 money = money * (1 + interestRate* 0.01)
            mon = mon * (1 + interestRate * 0.01);
        }

        // 시간(년) 반환
        return year;
    }
}
