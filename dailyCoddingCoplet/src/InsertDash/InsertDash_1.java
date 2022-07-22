package InsertDash;

public class InsertDash_1 {
    public String insertDash(String str) {
        // TODO:
        if(str.length() == 0) return null;
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) > 48 && str.charAt(i) <= 57 && str.charAt(i+1) > 48 && str.charAt(i+1) <= 57) {
                if((str.charAt(i) - '0') % 2 == 1 && (str.charAt(i+1) - '0') % 2 == 1) {
                    String a = str.substring(0, i+1);
                    String b = str.substring(i+1, str.length());
                    str = a + "-" + b;
                }
            }
        }
        return str;
    }
}
