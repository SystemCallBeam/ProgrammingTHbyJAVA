import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] dw = new int[9];
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                dw[i] = sc.nextInt();
                sum += dw[i];
            }
            for (int i = 0; i < 8; i++) {
                for (int j = i + 1; j < 9; j++) {
                    if (sum - dw[i] - dw[j] == 100) {
                        for (int k = 0; k < 9; k++) {
                            if (!(k == i || k == j)) {
                                System.out.println(dw[k]);
                            }else{
                                continue;
                            }
                        }
                        return;
                    }
                }
            }
        }
    }
}
