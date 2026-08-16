class Solution {
    public int subarraySum(int[] nums, int k) {
        // [2,-1,1,2], k = 2
                // ^


         //

        Map<Integer, Integer> map = new HashMap<>(); //key: sum, value: number of time it occurrences
        // 0 1
        // 2 2
        // -1 1
        // currentSum - previousSum = k
        // previousSum = currentSum - k
        //count = 2 + 2 =4
        int count = 0;
        int currentSum = 0;

        map.put(0,1);

        for (int num : nums) {
            currentSum += num;

            int previousSum = currentSum - k; 

            if (map.containsKey(previousSum)) {
                count += map.getOrDefault(previousSum, 0);
            }

            map.put(currentSum, map.getOrDefault(currentSum,0) + 1);

        }

        return count;
    }
}