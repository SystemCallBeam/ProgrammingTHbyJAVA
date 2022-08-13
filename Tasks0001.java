import java.util.Scanner;
class Tasks0001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a + b + c;
        if (result>=80) {
            System.out.println("A");
        }
        else if (result>=75) {
            System.out.println("B+");
        }
        else if (result>=70) {
            System.out.println("B");
        }
        else if (result>=65) {
            System.out.println("C+");
        }
        else if (result>=60) {
            System.out.println("C");
        }
        else if (result>=55) {
            System.out.println("D+");
        }
        else if (result>=50) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
