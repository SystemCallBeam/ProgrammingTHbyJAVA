import java.util.Scanner;

class Tasks0010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        char[] c = string.toCharArray();
        int[] a = { 1, 0, 0 };
        int temp;
        for (int i = 0; i < string.length(); i++) {
            if (c[i] == 'A') {
                temp = a[0];
                a[0] = a[1];
                a[1] = temp;
            } else if (c[i] == 'B') {
                temp = a[1];
                a[1] = a[2];
                a[2] = temp;
            } else if (c[i] == 'C') {
                temp = a[2];
                a[2] = a[0];
                a[0] = temp;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (1 == a[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
