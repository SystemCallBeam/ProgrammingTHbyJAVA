import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] table = new int[n][2];
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                if (j % i == 0) {
                    if (table[j-2][1] == 0){
                        table[cnt++][0] = j;
                        table[j-2][1] = 1;
                    }
                }
            }
        }
        System.out.println(table[m][0]);
    }
}
