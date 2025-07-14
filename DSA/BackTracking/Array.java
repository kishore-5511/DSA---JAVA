package DSA.BackTracking;

public class Array {

    public static void changeArr(int arr[], int i, int val) {
        // Base Case
        if(i == arr.length) {
            printArr(arr);
            return;
        }

        // Recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1); // Function call step
        arr[i] = arr[i] - 2;  // Backtracking step
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
