import java.util.Scanner;

public class Q2 {

    public static boolean isBalanced(String s) {
        int count = 0;
        char [] c = s.toCharArray();
        for (int i=0; i<c.length; i++) {
            if (c[i] == '(') {
                count++;
            } else if (c[i] == ')') {
                count--;
            }
            if (count < 0) {
                return false;  // More closing parentheses than opening
            }

        }
        return count == 0;  // Balanced only if count ends at 0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String input = sc.nextLine();

        if (isBalanced(input)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }

        sc.close();
    }
}
