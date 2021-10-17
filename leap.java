import java.util.*;

class leap {
    public static void main(String a[]) {
        int year;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year : ");
        year = s.nextInt();
        if (year % 4 == 0)
            System.out.println("The given year is a leap year. ");
        else
            System.out.println("The year is not a leap year.");
    }
}