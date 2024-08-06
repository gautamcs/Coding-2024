package gautam.codePractise;

import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {
    public static int[] m1(int arr[], int target) {
        int[] res = new int[2]; //{arr[i], arr[j]};
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (target == temp + arr[j]) {
                    res[0] = arr[i];
                    res[1] = arr[j];
                    //System.out.println(" Found :"+arr[i]+" , "+arr[j]);
                    //System.out.println(" Result Data: "+ Arrays.toString(res));
                    break;
                }
            }
            //break;
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 5};
        int target = 9;

        // int[] res = TwoSum.m1(arr, target);
        // System.out.println(Arrays.toString(res));

        System.out.println(" Array Length: " + arr.length);
        System.out.println(" Data: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            HashSet<Integer> set = new HashSet<>();
            set.add(temp);
            if (set.contains(target - temp))
                for (int j = i + 1; j < arr.length; j++) {
                    if (target == temp + arr[j]) {
                        int[] res = {arr[i], arr[j]};
                        System.out.println(" Found :" + arr[i] + " , " + arr[j]);
                        System.out.println(" Result Data: " + Arrays.toString(res));
                        break;
                    }
                }
            //break;
        }
        // System.out.println(" Result Data: "+ Arrays.toString(res));
        System.out.println(" Not Found !!");


    }
}
