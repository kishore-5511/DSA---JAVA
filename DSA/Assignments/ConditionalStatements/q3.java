// Days in a week
package DSA.Assignments.ConditionalStatements;
import java.util.*;
public class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Week Number (1-7) ");
        int week = sc.nextInt();
        switch(week) {
            case 1 : System.out.println("Monday");
                     break;
            case 2 : System.out.println("Tuesday");
                     break;
            case 3 : System.out.println("Wednesday");
                     break;
            case 4 : System.out.println("Thursday");
                     break;
            case 5 : System.out.println("Friday");
                     break;
            case 6 : System.out.println("Saturday");
                     break;
            case 7 : System.out.println("Sunday");
                     break;
            default : System.out.println("Inavlid Input");
        }
        sc.close();
    }
}
