import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //System.out.println("Task 0019");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), min, i;
        int[] S = new int[n], B = new int[n];
        for (i = 0; i < n; i++) {
            S[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        min = abs(S[0] - B[0]);
        min = solve(min, 1, 0, S, B, 0, 0, n);
        System.out.println(min);
    }

    static int abs(int n) {
        return (n < 0) ? -n : n;
    }

    static int solve(int min, int curS, int curB, int[] S, int[] B, int stt, int index, int n) {
        if (index >= n) return min;
        //System.out.println(min + " (min)> " + abs((curS * S[index]) - (curB + B[index])));
        if (min > abs((curS * S[index]) - (curB + B[index]))) {
            min = abs((curS * S[index]) - (curB + B[index]));
            //System.out.println("minless = " + min);
        }
        //System.out.println("is : " + index + " (i)<(n) " + n);
        if (index < n) {
            //System.out.println("curSB :==> " + curS + " " + curB + " stt index ==> " + stt + " " + index);
            min = solve(min, curS * S[index], curB + B[index], S, B, index, index + 1, n);
        }
        //System.out.println("stt + 1 : " + (stt + 1) + " <(n) " + n);
        for (int i = stt + 1; i < n; i++) {
            //System.out.println("b4loop" + curS + "-" + curB + " i = " + i);
            min = solve(min, curS, curB, S, B, index, i, n);
        }
        //System.out.println("final min :=> " + min);
        return min;
    }
}
