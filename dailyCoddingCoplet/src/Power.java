public class Power {
    public long power(int base, int exponent) {
        // TODO:
        final long MAX = 94906249;
        if (exponent == 0) return 1L;
        if (exponent == 1) return base;
        if (exponent % 2 == 0) {
            long powerNum = power(base, exponent / 2);
            return (powerNum * powerNum) % MAX;
        } else {
            long powerNum = power(base, exponent / 2);
            return (base * powerNum * powerNum) % MAX;
        }
    }
}

