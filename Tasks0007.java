import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;
        double r = scanner.nextDouble();
        System.out.printf("%.6f\n",pi*r*r);
        System.out.printf("%.6f\n",2*r*r);
    }
}
