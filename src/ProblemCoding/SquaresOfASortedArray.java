package ProblemCoding;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public static void main(String[] args) {
        int[] squareArray = squaresOfASortedArray(new int[]{-4, -1, 0, 3, 10});

        Arrays.stream(squareArray).forEach(System.out::println);
    }

    public static int[] squaresOfASortedArray(int[] intArray) {
        int[] squareArray = new int[intArray.length];


        for (int i = 0; i < intArray.length; i++) {
            squareArray[i] = (int) Math.pow(intArray[i], 2);
        }
        Arrays.sort(squareArray);
        return squareArray;
    }

}
