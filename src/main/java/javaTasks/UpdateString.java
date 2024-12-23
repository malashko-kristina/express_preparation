package javaTasks;

public class UpdateString {

    public static String removeDoubledCharacters(String str) {
        if (str == null || str.isEmpty() || str.length() == 1) {
            return str;
        }
        char prev = str.charAt(0);
        StringBuilder result = new StringBuilder();
        result.append(prev);
        for (int i = 1; i < str.length(); i++) {
            if(prev != str.charAt(i)) {
                prev = str.charAt(i);
                result.append(prev);
            }
        }
        return result.toString();
    }
}
