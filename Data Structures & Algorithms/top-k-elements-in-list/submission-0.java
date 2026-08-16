class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            else {
                map.put(num, map.get(num) +1);
            }
        }

        // 1 1
        // 2 2
        // 3 3

        // 3 2 1 

        // 3 2

        var list = map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());

        int[] solution = new int[k];
        for (int i=0; i<k; i++) {
            solution[i] = list.get(i);
        }

        return solution;

        
    }
}
