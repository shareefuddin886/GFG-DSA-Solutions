class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
            else{
                map.put(ch,1);
            }
        }
        
        char ans = 'a';
        int maxFreq = -1;

        // 1. Loop through all the unique characters (keys) in your map
        for (char ch : map.keySet()) {
            int currentFreq = map.get(ch); // Get the frequency of this character

            // 2. If this character appears more times than our current max, update it!
            if (currentFreq >= maxFreq) {
                maxFreq = currentFreq;
                ans=ch;
            }
        }
        
        for(char ch:map.keySet()){
            int currentfreq=map.get(ch);
            if(currentfreq>=maxFreq){
                if(ch<ans) ans=ch;
            }
        }
        

        return ans;

    }
}