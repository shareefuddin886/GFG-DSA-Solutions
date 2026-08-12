class Solution {
    public boolean isPalinSent(String s) {
        // code here
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        if(s.isEmpty()) return true;
        
        char[] arr=s.toCharArray();
        int i=0; int j=arr.length-1;
        while(i<=j){
            if(arr[i]!=arr[j]){
                return false;
            } 
            else{
                i++;j--;
            }
        }
        return true;
    }
}