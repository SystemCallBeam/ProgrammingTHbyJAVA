import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] Adrian = {'A', 'B', 'C'};
        char[] Bruno = {'B', 'A', 'B', 'C'};
        char[] Goran = {'C', 'C', 'A', 'A', 'B', 'B'};
        int n = sc.nextInt(), adrian = 0, bruno = 1, goran = 2, max = 0;
        String ans = sc.next();
        String[] name = {"Adrian", "Bruno", "Goran"};
        char[] Ans = ans.toCharArray();
        int[] point = {0, 0, 0};
        for (int i = 0; i < n; i++) {
            if (Adrian[i%3]==Ans[i]) {
                point[adrian]++;
            }
            if (Bruno[i%4]==Ans[i]) {
                point[bruno]++;
            }
            if (Goran[i%6]==Ans[i]) {
                point[goran]++;
            }
        }
        for (int i = 0; i < 3; i++) {
            if(point[i] > max) max = point[i];
        }
        System.out.println(max);
        for (int i = 0; i < 3; i++) {
            if (point[i] == max) {
                System.out.println(name[i]);
            }
        }
    }
}
