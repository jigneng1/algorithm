public class multiplyLarge {
    public static void main(String[] args) {
        String num1 = "234";
        String num2 = "721";
        String answer = "";
        System.out.println(num1.substring(0, num1.length() / 2) + " " + num1.substring(num1.length() / 2));
        System.out.println(num2.substring(0, num2.length() / 2) + " " + num2.substring(num2.length() / 2));
        answer = multiply(num1, num2);
        System.out.println(num1 + " x " + num2 + " = " + answer);
    }

    public static String multiply(String a, String b) {
        // c2 = a1*b1
        // c0 = a0*b0
        // c1 = (a1*a0)*(b1*b0)-c2-c0
        // c11 = multiply((a1*a0)*(b1*b0))
        // c1 = c11 - c2 - c0
        if (a.length() == 1 && b.length() == 1) {
            return Integer.parseInt(a) * Integer.parseInt(b) + "";
        } else if (a.length() == 1) {
            a = "0" + a;
        } else if (b.length() == 1) {
            b = "0" + b;
        }
        int maxLength = Math.max(a.length(), b.length());
        int totalLength = 2;
        for (; totalLength < maxLength; totalLength *= 2)
            ;
        for (int i = a.length(); i < totalLength; i++) {
            a = "0" + a;
        }
        for (int i = b.length(); i < totalLength; i++) {
            b = "0" + b;
        }

        String a1, a0, b1, b0;
        a1 = a.substring(0, a.length() / 2);
        a0 = a.substring(a.length() / 2);

        b1 = b.substring(0, b.length() / 2);
        b0 = b.substring(b.length() / 2);
        String c0, c1, c11, c2, c = "";// answer
        c2 = multiply(a1, b1);
        c0 = multiply(a0, b0);
        c11 = multiply(((Integer.parseInt(a1) + Integer.parseInt(a0)) + ""),
                ((Integer.parseInt(b1) + Integer.parseInt(b0)) + ""));
        c1 = (Integer.parseInt(c11) - Integer.parseInt(c2) - Integer.parseInt(c0) + "");
        c = (Integer.parseInt(time10PowerByI(c2, a.length()))
                + Integer.parseInt(time10PowerByI(c1, a.length() / 2))
                + Integer.parseInt(c0) + "");

        return c;
    }

    public static String time10PowerByI(String num, int i) {
        for (int j = 0; j < i; j++) {
            num += "0";
        }
        return num;
    }

}
