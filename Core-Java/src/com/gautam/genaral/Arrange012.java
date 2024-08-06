package gautam.codePractise;

import java.util.Arrays;

public class Arrange012 {
    public static void main(String[] args) {

        int[] arr = {1,2,0,0,1,1,2,2,0,0,0,1};
        //int[] arr = {1,0,0,0,1,1,0,1,0,0,0,1};

        System.out.println("Original Array: "+ Arrays.toString(arr));

        int lo = 0;
        int mid = 0;
        int hi = arr.length -1;
        int temp = 0;

        //  Dutch National Flag Algorithm:
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        
        while(mid <= hi) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[hi];
                    arr[hi] = arr[mid];
                    arr[mid] = temp;
                    hi--;
                    break;
                }
            }
        }

        System.out.println("Sorted Array: "+ Arrays.toString(arr));

    }
}
