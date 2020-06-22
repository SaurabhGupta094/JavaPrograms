package ProblemCoding;

//Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//        Therefore only 12 and 7896 contain an even number of digits.

//Constraints:
//
//        1 <= nums.length <= 500
//        1 <= nums[i] <= 10^5

public class NumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        System.out.println(noOfNumbersWithEvenDigits(new int[]{13, 1, 12, 345, 2, 6, 7896,14}));
    }


    public static int noOfNumbersWithEvenDigits(int[] nums) {
        int iEvenNumberCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int iNumDigitCounter = 0;

            while (number != 0) {
                number = number / 10;
                iNumDigitCounter++;
            }

            if (iNumDigitCounter != 0 && iNumDigitCounter % 2 == 0) {
                iEvenNumberCounter++;
            }
        }

        return iEvenNumberCounter;
    }


}
