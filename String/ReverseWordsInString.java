
public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "the sky is    blue";
        String res = reverseWords(str);
        System.out.println(res);
    }

    private static String reverseWords(String str) {
        String[] words = str.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" "); 
        }

        return sb.toString();
    }
}
