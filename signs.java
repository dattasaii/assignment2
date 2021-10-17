import java.util.*;

class signs {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = s.nextInt();
        System.out.println("Enter the second number");
        int b = s.nextInt();
        if (a > 0 && b > 0)
            System.out.println("They have equal signs");
        else
            System.out.println("They are of opposite signs");
    }
}