
public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 3749;
        String res = findRoman(num);
        System.out.println(res);
    }

    private static String findRoman(int num) {
        String res = "";
        int thoshend = num / 1000;
        for (int i = 1; i <= thoshend; i++) {
            res += "M";
        }
        num = num % 1000;
        if (num - 900 > 0) {
            res += "CM";
            num = num % 100;
        }
        int five = num / 500;
        for (int i = 1; i <= five; i++) {
            res += "D";
        }
        num = num % 500;
        
        return res;
    }
}
