// Even number checker.
package DSA.Assignments.Functions;
import java.util.*;
public class q2 {

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The entered number is even: " + isEven(n));
        sc.close();
    }
}
