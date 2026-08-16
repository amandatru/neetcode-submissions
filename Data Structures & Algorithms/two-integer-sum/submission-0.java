class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int currentValue = nums[i];
            int complement = target - currentValue;
            if (complementMap.containsKey(currentValue)) {
                return new int[] {complementMap.get(currentValue), i};
            }
            complementMap.put(complement, i);
        }

        return new int[0];
    }
}
