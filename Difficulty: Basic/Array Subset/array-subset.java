
import java.util.HashMap;

class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // 1. ADD ELEMENTS FROM ARRAY 'a' INTO amap
        for (int num : a) {
            if (map.containsKey(num)) {
                int freq = map.get(num);
                map.put(num, freq + 1);
            } else {
                map.put(num, 1);
            }
        }
        for(int i=0;i<b.length;i++){
            if(!map.containsKey(b[i])) return false;
            int freq=map.get(b[i]);
            if(freq==0){
                return false;
            }
            else{
                map.put(b[i],freq-1);
            }
        }

       

        return true;
    }
}
