class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
            ArrayList<Integer> list=new ArrayList<>();
        int i=1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==i) list.add(arr[j]);
            i++;
        }
        
        return list;
    }
}
