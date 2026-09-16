package JavaPractice2;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

    //    For index 0 → product of all except 1 = 2×3×4 = 24
    //    For index 1 → product of all except 2 = 1×3×4 = 12
    //    For index 2 → product of all except 3 = 1×2×4 = 8
    //    For index 3 → product of all except 4 = 1×2×3 = 6
                int[] nums = {1, 2, 3, 4};
                int n = nums.length;
                int[] result = new int[n];

                // Step 1: Prefix products
                int prefix = 1;
                for (int i = 0; i < n; i++) {
                    result[i] = prefix;
                    prefix *= nums[i];
                }

        System.out.println(Arrays.toString(result));

                // Step 2: Suffix products
                int suffix = 1;
                for (int i = n - 1; i >= 0; i--) {
                    result[i] *= suffix;
                    suffix *= nums[i];
                }

                System.out.println(Arrays.toString(result));
            }
        }

