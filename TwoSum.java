import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(array, target);
        System.out.println(Arrays.toString(result));
    }

     /**
     * Finds two distinct indices in the array such that
     * the sum of their values equals the target.
     *
     * @param nums   Array of integers
     * @param target Target value to be achieved by summing two numbers
     * @return An array containing the two indices
     * @throws IllegalArgumentException if no valid pair is found
     */
    public static int[] twoSum(int[] nums, int target) {

        // Map to store each number and its corresponding index
        // Key   -> number from the array
        // Value -> index of that number
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array only once (O(n))
        for (int i = 0; i < nums.length; i++) {

            // Calculate the value needed to reach the target
            int complement = target - nums[i];

            // Check if this complement was already seen
            if (map.containsKey(complement)) {
                // Return the index of the complement and the current index
                return new int[]{map.get(complement), i};
            }

            // Store the current number and its index in the map
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution found");
    }
}

