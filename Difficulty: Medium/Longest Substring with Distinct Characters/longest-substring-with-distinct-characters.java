class Solution {
	public int longestUniqueSubstr(String s) {
		// code here
		int result = 0;
	
		int i = 0; int j = 0;
		HashSet<Character> set = new HashSet<>();
		while (j<s.length()) {
			if (!set.contains(s.charAt(j))) {
			    set.add(s.charAt(j));
				j++;
			}
			else if (set.contains(s.charAt(j))) {
			    result=Math.max(j-i,result);
				for (int k = i; k<j; k++) {
					set.remove(s.charAt(i));
					i++;
					if (!set.contains(s.charAt(j))){
					    break;
					}
					}
			}
		}
		result=Math.max(result,j-i);
		return result;
	}
}
