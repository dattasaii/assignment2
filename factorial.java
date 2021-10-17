import java.util.*;

class factorial {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial :");
        int n = s.nextInt();
        int factorial = fact(n);
        System.out.println("The factorial of given number is : " + factorial);
    }

    static int fact(int num) {
        int result;
        if (num == 1)
            return 1;
        else
            result = fact(num - 1) * num;
        return result;
    }
}