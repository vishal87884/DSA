import java.util.LinkedList;

public class FIndLongestSubStringWithOutRepeatingCharacter {
    public static void main(String[] args) {
        String s = "bbbbb";
        int res = findTheString(s);
        System.out.println(res);
    }

    private static int findTheString(String str) {
        if (str.trim().equals("") && str.length() == 0) {
            return 0;
        }
        if (str.trim().equals("")) {
            return 1;
        }
        int res = 0;
        LinkedList<Character> myChar = new LinkedList<>();
        int s = 0, e = 0;
        while (e < str.length() && s < str.length()) {
            if (!myChar.contains(str.charAt(e))) {
                myChar.add(str.charAt(e));
                e++;
            } else {
                myChar.removeFirst();
                s++;
            }
            res = Math.max(res, (e - s));
        }
        return res;

    }
}
