class Solution {
    public void rotate(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        list.add(arr[arr.length-1]);
        for(int i=0;i<arr.length-1;i++){
            list.add(arr[i]);
        }
        int i=0;
        for(int ele:list){
            arr[i]=ele;
            i++;
        }
    }
}