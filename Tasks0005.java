import java.util.Scanner;
import java.math.MathContext;

class Tasks0005 {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        System.out.printf("%.6f", Math.sqrt(a*a + b*b));
    }
}
