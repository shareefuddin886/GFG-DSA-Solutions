class Solution {
	int countPairs(int[] arr, int k) {
		// code here
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i<arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				
				map.put(arr[i], 1);
			}
			else {
				int freq = map.get(arr[i]);
				map.put(arr[i], freq + 1);
			}
			
		}
		
		int count = 0;
		for (int ele:map.keySet()) {
			if (map.containsKey(ele + k)) {
				count = count + map.get(ele)*map.get(ele+k);
			}
			
		}
		return count;
	}	


	
}
