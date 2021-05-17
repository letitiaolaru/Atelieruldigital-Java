import java.util.Scanner;

public class Challenge2 {

    public static String compute(int a) {
        String sir = new String();
        int k = 0;
        if (a % 3 == 0) {
            sir += "Foo";
        }
        if (a % 5 == 0) {
            sir += "Bar";
        }
        if (a % 7 == 0) {
            sir += "Qix";
        }
        int b = 0;
        while (a > 0) {
            b = b * 10 + a % 10;
            a /= 10;
        }
        a = b;

        while (a > 0) {
            if (a % 10 == 0) {
                sir += "*";
                k += 1;
            } else if (a % 10 == 3) {
                sir += "Foo";
            } else if (a % 10 == 5) {
                sir += "Bar";
            } else if (a % 10 == 7) {
                sir += "Qix";
            }
            a /= 10;
        }

        int ok = 0;
        if (sir.length() == k) {
            ok = 1;
        }
        if (ok == 1) {
            String sir1 = new String();
            while (b > 0) {
                if (b % 10 == 0) {
                    sir1 += "*";
                } else {
                    sir1 += b % 10;
                }
                b /= 10;
            }
            return sir1;
        } else {
            return sir;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        String sir = compute(num);
            System.out.println(sir);
    }
}
