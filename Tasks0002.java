import java.util.Scanner;
class Tasks0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int max = sc.nextInt(), min = max;
        for (int i = 1; i < m; i++) {
            int n = sc.nextInt();
            if (max < n) {
                max = n;
            }
            if (min > n) {
                min = n;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
