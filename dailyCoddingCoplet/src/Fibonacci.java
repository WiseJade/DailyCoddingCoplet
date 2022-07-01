public class Fibonacci {
    public int fibonacci(int num) {
        // TODO:
        return fiboCal(num, 1, 0);

    }

    public int fiboCal(int num, int pre, int pre_2) {
        if (num == 0)
            return pre_2;
        if (num == 1)
            return pre;
        int curNum = pre + pre_2;
        return fiboCal(num - 1, curNum, pre);
    }
}