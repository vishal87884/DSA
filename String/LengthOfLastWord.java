package String;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "Hello World";
        int res = lengthOfLastWord(str);
        System.out.println(res);
    }

    private static int lengthOfLastWord(String str) {
        int len = 0;
        str = str.trim();
        int e=str.length()-1;
        while (e>=0 && str.charAt(e)!=' ') {
            len++;
            e--;
        }
        return len;
    }
}
