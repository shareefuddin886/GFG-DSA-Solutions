class Solution {
	public static boolean areAnagrams(String s1, String s2) {
		// code here
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s1.length();i++){
		    if(map.containsKey(s1.charAt(i))){
		      int   freq=map.get(s1.charAt(i));
		      map.put(s1.charAt(i),freq+1);
		        
		    }
		    else{
		        map.put(s1.charAt(i),1);
		    }
		}
		
		for(int i=0;i<s2.length();i++){
		    if(!map.containsKey(s2.charAt(i))) return false;
		    int freq=map.get(s2.charAt(i));
		    if(freq==0) {
		        return false;
		    
		        
		    }
		    else{
		        map.put(s2.charAt(i),freq-1);
		    }
		}
		return true;
	}
}
