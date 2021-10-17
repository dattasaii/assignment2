import java.util.*;

class sum_mul {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = 0;

    void sum_two_num() {
        c = a + b;
        System.out.println("sum of two numbers is : " + c);
    }

    void sum_three_num() {
        System.out.println("Enter the third number : ");
        int d = s.nextInt();
        c = a + b + d;
        System.out.println("sum of three numbers is : " + c);
    }

    void mul_two_num() {
        c = a * b;
        System.out.println("mul of two numbers is : " + c);
    }

    void mul_three_num() {
        System.out.println("Enter the third number : ");
        int d = s.nextInt();
        c = a * b * d;
        System.out.println("mul of three numbers is : " + c);
    }
}

class method1 {
    public static void main(String args[]) {
        sum_mul p = new sum_mul();
        p.sum_two_num();
        p.sum_three_num();
        p.mul_two_num();
        p.mul_three_num();
    }
}