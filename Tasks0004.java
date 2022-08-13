import java.util.Scanner;
class Tasks0004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Word = scanner.nextLine();
        boolean CAP = false, cap = false;
        for (int i = 0; i < Word.length(); i++) {
            if (Word.charAt(i) - 'a' >= 0 && Word.charAt(i) - 'a' <= 26) {
                cap = true;
            } else {
                CAP = true;
            }
        }
        if (cap && CAP) {
            System.out.println("Mix");
        } else if (cap) {
            System.out.println("All Small Letter");
        } else {
            System.out.println("All Capital Letter");
        }
    }
}
