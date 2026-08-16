class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            var currentNumber = nums[i];
            if (!frequencyMap.containsKey(currentNumber)) {
                frequencyMap.put(currentNumber, 1);
            }
            else {
                var count = frequencyMap.get(currentNumber);
                frequencyMap.put(currentNumber, count + 1);
            }
        }

        Queue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(frequencyMap.entrySet());

        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = maxHeap.poll().getKey(); 
        }

        return arr;
    }
}
