import java.util.HashSet;
import java.util.Set;

public class Test8 {
    public static void main(String[] args) {
        String str = "Welcome to the Java World";
        var x = extractVowels(str);
        for (Character c: x) {
            System.out.println("\"" + (c+"").toUpperCase() + "\"");
        }
    }
    public static Set<Character> extractVowels(String str){
        Set<Character> vowelSet = new HashSet<>();
        if(str == null || str.length() == 0) {
            return vowelSet;
        }

        int n = str.length();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowelSet.add(c);
            }
        }
        return vowelSet;
    }

    public static char[] extractVowels2(String str){
        char[] vowelSet = new char[108];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowelSet[c] = 1;
            }
        }
        return vowelSet;
    }
}
