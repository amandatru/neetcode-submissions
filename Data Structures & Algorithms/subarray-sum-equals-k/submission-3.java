class Solution {
    public int subarraySum(int[] nums, int k) {
        
        // key: prefix Sum value: # of occurrences
        // currentSum - previousSum = k
        // previousSum = currentSum - k

        //is there any subarrays in the map that our current spot could equal to K
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int currentSum = 0;

        map.put(0,1);

        for (int num: nums) {
            currentSum += num;

            int previousSum = currentSum - k;

            if (map.containsKey(previousSum)) {
                count += map.get(previousSum);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;


    }
}