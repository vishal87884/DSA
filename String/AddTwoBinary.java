
public class AddTwoBinary {
    public static void main(String[] args) {
        String a = "00100";
        String b = "010";
        String res = addTheBinary(a, b);
        System.out.println(res);
    }

    private static String addTheBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (carry != -1) {
            while (i >= 0 && j >= 0) {
                if (a.charAt(i) == '1' && b.charAt(j) == '1' && carry == 1) {
                    res.append('1');
                    carry = 1;
                } else if (a.charAt(i) == '1' && b.charAt(j) == '0' && carry == 1
                        || a.charAt(i) == '1' && b.charAt(j) == '1' && carry == 0 ||
                        a.charAt(i) == '0' && b.charAt(j) == '1' && carry == 1) {
                    res.append('0');
                    carry = 1;
                } else if (a.charAt(i) == '0' && b.charAt(j) == '0' && carry == 0) {
                    res.append('0');
                } else if (a.charAt(i) == '0' && b.charAt(j) == '0' && carry == 1) {
                    res.append('1');
                    carry = 0;
                } else {
                    res.append('0');
                }
                i--;
                j--;
            }
            while (i >= 0) {
                if (a.charAt(i) == '1' && carry == 1) {
                    res.append('0');
                    carry = 1;
                } else {
                    res.append('1');
                }
                i--;
            }
            while (j >= 0) {
                if (b.charAt(i) == '1' && carry == 1) {
                    res.append('0');
                    carry = 1;
                } else {
                    res.append('1');
                }
                j--;
            }
            if (carry == 0) {
                carry = -1;
            } else {
                res.append('1');
                carry = -1;
            }

        }
        return res.reverse().toString();
    }
}