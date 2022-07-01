public class DecryptCaesarCipher {
    public String decryptCaesarCipher(String str, int secret) {
        // TODO:
        if(str.isEmpty()) return str;
        String result = "";
        char[] charArr = str.toCharArray();
        for(char temp : charArr) {
            if (temp == ' ') {
                result = result.concat(" ");
            }
            else if (temp - secret < 97) {
                result += String.valueOf((char)(temp - secret + 26));
            }
            else {
                result += String.valueOf((char)(temp - secret));
            }
        }
        return result;
    }
}
