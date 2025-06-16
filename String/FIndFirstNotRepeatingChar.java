

import java.util.HashMap;

public class FIndFirstNotRepeatingChar {

    public static void main(String[] args) {
        String str = "hello";
        char ch = useFrequencyCount(str);
        System.out.println(ch);
    }

    private static char findChar(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (hm.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }
        System.out.println(hm);
        return '$';
    }

    private static char useFrequencyCount(String str) {
        int[] ch = new int[26];
        for (int i = 0; i < str.length(); i++) {
            ch[str.charAt(i) - 'a']++;
        }
        for (char i : str.toCharArray()) {
            if (ch[i - 'a'] == 1) {
                return i;
            }
        }
        return '$';
    }
}