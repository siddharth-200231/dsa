import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6};
        int k = 6;
        subarraySum(nums, k, 0, 0, new ArrayList<>());
    }

    public static void subarraySum(int[] nums, int k, int i, int sum, List<Integer> subList) {
        if (i == nums.length) {
            if (sum == k) {
                System.out.println(subList);
            }
            return;
        }

        // Include the current element in the subList
        subList.add(nums[i]);
        subarraySum(nums, k, i + 1, sum + nums[i], subList);

        // Exclude the current element from the subList
        subList.remove(subList.size() - 1);
        subarraySum(nums, k, i + 1, sum, subList);  // Pass the sum unchanged
    }
}
