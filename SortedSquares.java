//<aside>
//[6]---Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.
//
//**Example 1:**
//
//Input: nums = [-4,-1,0,3,10]
//
//Output: [0,1,9,16,100]
//
//</aside>

import java.util.Arrays;

public class SortedSquares {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            index--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] squaredArray = sortedSquares(nums);
        System.out.println("Sorted Squares: " + Arrays.toString(squaredArray));
    }
}
