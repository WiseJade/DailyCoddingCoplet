public class PowerOfTwo {
    public boolean powerOfTwo(long num) {
        // TODO:
        if(num == 1) return true;
        while(num % 2 == 0) {
            return powerOfTwo(num / 2);
        }
        return false;
    }
    public static void main(String[] args) {
        PowerOfTwo p = new PowerOfTwo();
        System.out.println(p.powerOfTwo(1024));
    }
}

