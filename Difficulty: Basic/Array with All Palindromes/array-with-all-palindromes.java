class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        for(int i=0;i<arr.length;i++){
            String  curr=String.valueOf(arr[i]);
         
            StringBuilder str=new StringBuilder(curr);
            if(!curr.equals(str.reverse().toString())) return false;
        }
        return true;
    }
}




// for (int i = 0; i < arr.length; i++) {
//     String curr = String.valueOf(arr[i]);
//     StringBuilder str = new StringBuilder(curr);
    
//     // Correct negation placement and string comparison
//     if (!curr.equals(str.reverse().toString())) {
//         return false;
//     }
// }
