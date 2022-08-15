import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int []table = new int[42];
            int curItem;
            for (int i = 0; i < 10; i++) {
                curItem = sc.nextInt();
                table[curItem%42] = 1;
            }
            int ans = 0;
            for (int i = 0; i < 42; i++) {
                ans += table[i];
            }
            System.out.println(ans);
        }
    }
}