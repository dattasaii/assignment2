import java.util.*;

class string {
    public static void main(String args[]) {
        String a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string : ");
        a = s.next();
        String b = a;
        int n = a.length();
        int m = n - 1;
        int i = 0;
        int cnt = 0;
        while (i < n && m >= 0) {
            if (b.charAt(m) == a.charAt(i)) {
                cnt++;
            }
            i++;
            m--;
        }
        if (cnt == n)
            System.out.println("It is a palindrome");
        else
            System.out.println("It is  not a palindrome");
    }
}