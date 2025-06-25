package DSA.ConditionalStatements;
public class Ternary {
    public static void main(String args[]) {
        int number = 4;
        String type = ((number%2)==0)? "Even" : "Odd";
        System.out.println(type);

        // Check if a Student will pass or fail
        int marks = 75;
        String status = (marks>35)? "Pass" : "Fail";
        System.out.println(status);
    }
}
