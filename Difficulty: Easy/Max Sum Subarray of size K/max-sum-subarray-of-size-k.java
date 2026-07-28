class Solution {
    public int maxSubarraySum(int[] arr, int k) {
      
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        int maxsum=windowsum;
        for(int j=k;j<arr.length;j++){
            windowsum+=arr[j];
            windowsum=windowsum-arr[j-k];
            maxsum=Math.max(maxsum,windowsum);
        }
        return maxsum;
    }
}

 

 