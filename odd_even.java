import java.util.*;

class odd_even {
    public static void main(String a[]) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = s.nextInt();
        if (num % 2 == 0)
            System.out.println("The given number is a even number");
        else
            System.out.println("The given number is an odd number");
    }
}