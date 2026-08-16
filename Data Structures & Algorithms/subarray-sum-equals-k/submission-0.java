class Solution {
    //prefix sum and hashmap problem

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        //key : prefix sum value: number times it occurs
        // currentSum- previousSum = k
        // 7 - 0 = 7
        //requiredPreviousSum = currentSum-k;

        //[2,-1,1,2]
        //        ^
        // map
        // 0 1
        // 1 1
        // 2 2
        // 

        int sum = 0;
        int count = 0; // 2 + 2

        map.put(0,1);

        for (int num : nums) {
            sum += num;

            int requiredPrevSum = sum - k;

            if (map.containsKey(requiredPrevSum)) {
                count += map.get(requiredPrevSum);
            } 

            map.put(sum, map.getOrDefault(sum, 0) + 1);
    

        }

        return count; 
    }
}