package ProblemCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Example 1:
//        Input: [1,1,0,1,1,1]
//        Output: 3
//        Explanation: The first two digits or the last three digits are consecutive 1s.
//        The maximum number of consecutive 1s is 3.

//        Note:
//
//        The input array will only contain 0 and 1.
//        The length of input array is a positive integer and will not exceed 10,000

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
