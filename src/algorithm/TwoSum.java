package algorithm;

public class TwoSum {

    public static int[] arrayIndices(int[]arr, int target) {
        int[] result = {-1,-1};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (target == arr[i] + arr[j]){

                    result[0] = i;
                    result[1] = j;

                    return result;

                }







            }

        }


        return result;
    }
}




