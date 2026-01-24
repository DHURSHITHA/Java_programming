import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Use TreeMap to keep keys sorted automatically for the "remaining" elements
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ind = 0;
        
        // Step 1: Place elements from arr2 in the order they appear
        for (int num : arr2) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                for (int j = 0; j < count; j++) {
                    arr1[ind++] = num;
                }
                map.remove(num); // Remove once processed
            }
        }

        // Step 2: The remaining keys in TreeMap are already sorted
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                arr1[ind++] = entry.getKey();
            }
        }

        return arr1;
    }
}
