

public class FindTheFirstOccurIndexOfEle {
    public static void main(String[] args) {
        String str = "leetcode";
        String target = "leeto";
        int res = findFirstOccurIndex(str, target);
        System.out.println(res);
    }

    private static int findFirstOccurIndex(String haystack, String needle) {
        int s1 = haystack.length();
        int s2 = needle.length();
        if (s1 < s2) {
            return -1;
        }
        int res = -1;
        String sub = "";
        for (int i = 0; i < s1; i++) {
            if ((i + s2 - 1) < s1) {
                sub = haystack.substring(i, i + s2);
                if (sub.equals(needle)) {
                    return i;
                }
            } else {
                break;
            }
        }
        return res;
    }
}
