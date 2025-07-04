package DSA.BitManipulation;

public class FastExpo {

    public static int FastExponential(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if((n & 1) != 0) {  // Checking LSB
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(FastExponential(3,5));
        System.out.println(FastExponential(5,3));
    }
}
