class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int arrn[]=new int[2];
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) even++;
            else{
                odd++;
            }
        }
        arrn[1]=even;
        arrn[0]=odd;
        return arrn;
    }
}