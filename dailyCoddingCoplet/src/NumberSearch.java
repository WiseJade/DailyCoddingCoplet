public class NumberSearch {
    public int numberSearch(String str) {
        // TODO:
        if(str.isEmpty()) return 0;
        double result = 0;
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                result += str.charAt(i) - '0'; // 1이면 49 - 48 = 1 로 저장
                count++;
            }
            if(str.charAt(i) == ' ')
                count++;
        }
        return (int)Math.round(result / (str.length() - count));
    }
}
