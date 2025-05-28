package String;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "cx";
        boolean res = checkAnagram(str1, str2);
        System.out.println(res);
    }

    private static boolean checkAnagram(String str1, String str2) {
        int first[] = new int[26];
        int second[] = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            first[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            second[str2.charAt(i) - 'a']++;
            System.out.println(str2.charAt(i)-'a');
        }
        for (int i = 0; i < second.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }
}
