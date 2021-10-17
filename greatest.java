import java.util.*;

class greatest {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the three numbers:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a > b) {
            if (a > c)
                System.out.println("The greatest number is : " + a);
            else
                System.out.println("The greates number is : " + c);
        } else if (b > c)
            System.out.println("The greates number is : " + b);
        else
            System.out.println("The greates number is : " + c);
    }
}