public class Modulo {
    public Integer modulo(int num1, int num2) {
        if(num2 == 0) return null;
        while(num1 >= num2) {
            num1 -= num2;
        }
        return num1;
    }
}
