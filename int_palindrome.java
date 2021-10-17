import java.util.*;

class int_palindrome {
    public static void main(String a[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();
        int rem, temp, rev = 0;
        temp = num;
        while (num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        if (temp == rev)
            System.out.println("Given number is a palindrome");
        else
            System.out.println("Given number is not a palindrome");
    }
}