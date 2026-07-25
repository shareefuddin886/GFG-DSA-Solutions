class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int a=-1;int b=-1;
        int min_dist=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
              a=i;
              if(b!=-1) 
              min_dist=Math.min(min_dist, Math.abs(a - b));
            }
        
        
        else if(arr[i]==y){ 
            b=i;
            if(a!=-1){
             
        min_dist=Math.min(min_dist, Math.abs(a - b));
            }
        
      }  
    }
    if(a==-1 || b==-1) return -1;
   return min_dist;
}
}