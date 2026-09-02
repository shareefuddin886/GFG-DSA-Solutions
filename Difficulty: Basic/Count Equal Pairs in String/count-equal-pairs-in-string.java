class Solution {
    public int equalPairs(String s) {
        // code here
       HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<s.length();i++){
           if(!map.containsKey(s.charAt(i))){
               map.put(s.charAt(i),1);
           }
           else{
               int freq=map.get(s.charAt(i));
               map.put(s.charAt(i),freq+1);
           }
       }
       
       int result=0;
       for(char ele:map.keySet()){
           result=result+map.get(ele)*map.get(ele);
       }
       return result;
    }
}