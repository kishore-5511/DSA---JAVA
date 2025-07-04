public class InsertionSort {

    public static void insertion_sort(int arr[]) {
        // Loop starts from index 1 because we assume the first element is already sorted
        for(int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //Findind out the correct position to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }

    public static void main(String args[]) {
        int arr[] = {5,3,2,1,4};
        insertion_sort(arr);
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Time Complexity - O(n^2)