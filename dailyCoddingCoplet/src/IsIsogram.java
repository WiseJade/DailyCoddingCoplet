public class IsIsogram {
    public boolean isIsogram(String str) {
        // TODO:
        if(str.length() == 0) return true;
        str = str.toLowerCase();
        for(int i = 0; i < str.length() - 1; i++) {
            for(int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }
}
