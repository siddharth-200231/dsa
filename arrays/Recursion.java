import java.util.ArrayList;
import java.util.List;
//print only 1 subarray
public class Recursion {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6,2,2,2};
        int k = 6;
        subarraySum(nums, k, 0, 0, new ArrayList<>());
    }

    public static boolean subarraySum(int[] nums, int k, int i, int sum, List<Integer> subList) {
        if (i == nums.length) {
            if (sum == k) {
                System.out.println(subList);
                return true;
            }
            return false;
        }

        // Include the current element in the subList
        subList.add(nums[i]);

       if( subarraySum(nums, k, i + 1, sum + nums[i], subList)==true) {
        return true;
       };

        // Exclude the current element from the subList
        subList.remove(subList.size() - 1);
       if( subarraySum(nums, k, i + 1, sum, subList)==true){
        return true;
       }  // Pass the sum unchanged
       return false;
    }
}
