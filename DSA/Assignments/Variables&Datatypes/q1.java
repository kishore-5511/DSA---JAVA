
// average of 3 numbers
import java.util.*;

public class q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (a + b + c) / 3;
        System.out.println(avg);

        sc.close();

    }
}
