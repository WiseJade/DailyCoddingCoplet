public class FirstReverse {
    public String firstReverse(String str) {
        // TODO:
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result.concat(String.valueOf(str.charAt(str.length() - i - 1)));
        }
        return result;
    }
}
