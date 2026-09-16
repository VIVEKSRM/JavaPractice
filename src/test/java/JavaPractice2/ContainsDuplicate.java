package JavaPractice2;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (!set.add(num)) {
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);

    }
}
