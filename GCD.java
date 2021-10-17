import java.util.*;

class GCD {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers ");
        int a = s.nextInt();
        int b = s.nextInt();
        int n;
        int gcd = 0;
        if (a > b)
            n = a;
        else
            n = b;
        for (int i = 1; i < n + 1; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        System.out.println("The GCD of two numbers is : " + gcd);
    }
}