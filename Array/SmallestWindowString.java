import java.util.HashSet;

public class SmallestWindowString {
    public static void main(String[] args) {
        String str = "aabcbcdbca";
        int res = findSmallestWindowString(str);
        System.out.println(res);
    }

    private static int findSmallestWindowString(String str) {
        int len = str.length();
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < len; i++) {
            hs.add(str.charAt(i));
        }
        int s = 0, e = 0;
        int res = 0;
        while (s < len && e < len) {
        if (hs.contains(hs)) {
            
        }
        }
        return res;
    }
}
