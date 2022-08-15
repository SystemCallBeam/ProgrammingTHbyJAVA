import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] square = new int[4];
            for (int i = 0; i < 4; i++) {
                square[i] = sc.nextInt();
            }
            int temp = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3 - i; j++) {
                    if (square[j] < square[j + 1]) {
                        temp = square[j];
                        square[j] = square[j + 1];
                        square[j + 1] = temp;
                    }
                }
            }
            System.out.println(square[1] * square[3]);
        }
    }
}
