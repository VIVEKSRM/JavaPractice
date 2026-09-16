package JavaPractice2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysStringsTwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int required = target - nums[i];  // For each number, calculate what other number is needed (required) to reach the target. If target = 9 and nums[i] = 2, then required = 7.

            if (map.containsKey(required)) {
                return new int[]{map.get(required), i}; //If the complement (required) is already in the map:
                                                        //That means we’ve seen a number earlier that pairs with the current one to make the target.
                                                       //Return the indices:
                                                        //map.get(required) → index of the earlier number.
                                                        //i → current index.
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(Arrays.toString(twoSum(prices, 15)));
    }
}
