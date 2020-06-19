package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConsecutiveNumber {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int iTemp = 0;
        List<Integer> maxNums = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                iTemp = nums[i] + iTemp;
                if (nums.length-1 == i) {
                    maxNums.add(iTemp);
                }
            } else {
                if (iTemp > 0)
                    maxNums.add(iTemp);
                iTemp = 0;
            }
        }

        return Collections.max(maxNums);

    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
}
