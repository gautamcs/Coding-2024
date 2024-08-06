package gautam.general;

import java.util.Arrays;

public class MoveZeroNOne {
    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 1, 0, 1};

        System.out.println(" Original Array: " + Arrays.toString(arr));

        int count0 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
                arr[i] = 1;
            }
        }

        for (int i = count0; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println(" Modified Array: " + Arrays.toString(arr));
    }
}
