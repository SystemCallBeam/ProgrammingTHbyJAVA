import java.util.Scanner;

class Tasks0015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((b - a > c - b)?b - a - 1:c - b - 1);
    }
}
