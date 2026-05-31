class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current;

            if (valueToIndex.containsKey(complement)) {
                return new int[] { valueToIndex.get(complement), i };
            }

            valueToIndex.put(current, i);
        }

        throw new IllegalArgumentException("No two sum solution exists");
    }
}