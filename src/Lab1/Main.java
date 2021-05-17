package Lab1;

public class Main {
    public static void displayArray() {
        int a[] = new int[3];
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        int[] c = copyAray(a);
        for(int i = 0; i < a.length; i++) {
            System.out.println(c[i]);
        }
    }

    public static int[] copyAray(int[] b) {
        int c[] = new int[3];
        System.arraycopy(b,1,c,0,2);
        return c;
    }

    public static void main(String[] args) {
        System.out.println("It works");
        displayArray();
    }
}
