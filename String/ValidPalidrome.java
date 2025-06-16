
public class ValidPalidrome {
    public static void main(String[] args) {
        String str = "0p";
        boolean res = find(str);
        System.out.println(res);
    }

    private static boolean find(String str) {
        str=str.toLowerCase();
       int s=0,e=str.length()-1;
       while (s<e) {
        char start=str.charAt(s);
        char end=str.charAt(e);
        while (s<e && Character.isLetter(start)==false && Character.isDigit(start)==false) {
            s++;
            start = str.charAt(s);
        }
        while (s<e && Character.isLetter(end)==false && Character.isDigit(start)==false) {
           
            e--;
            end = str.charAt(e);}
        if (start!=end) {
            return false;
        }
        s++;
        e--;
       }
       return true;
    }
}
