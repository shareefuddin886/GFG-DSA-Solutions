class Solution {
	static ArrayList<Integer> subarraySum(int[] arr, int target) {
		// code here
		int i = 0; int j = 0;
		ArrayList<Integer> list = new ArrayList<>();
		int sum = arr[i];
		while (j<arr.length) {
			
			if (sum == target) {
				list.add(i + 1);
				list.add(j + 1);
				return list;
			}
			else if (sum < target) {
				j++;
				if (j < arr.length) { // Fixes the ArrayIndexOutOfBoundsException
					sum = sum + arr[j];
				}
			    
			}
				else{ 
					sum = sum - arr[i];
					i++;
				}
				
			
			
		}
		
		if (list.isEmpty()) {
			list.add(-1);
			return list;
		}
		return list;
	}
	
}
