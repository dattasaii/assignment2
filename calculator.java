import java.util.*;

class calculator {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = 0;

    void sum() {
        c = a + b;
        System.out.println("The sum of two numbers is : " + c);
    }

    void sub() {
        if (a > b)
            c = a - b;
        else
            c = b - a;
        System.out.println("The sub of two numbers is : " + c);
    }

    void mul() {
        c = a * b;
        System.out.println("The mul of two numbers is : " + c);
    }

    void div() {
        c = a / b;
        System.out.println("The div of two numbers is : " + c);
    }
}

class method {
    public static void main(String args[]) {
        calculator p = new calculator();
        p.sum();
        p.sub();
        p.mul();
        p.div();
    }
}