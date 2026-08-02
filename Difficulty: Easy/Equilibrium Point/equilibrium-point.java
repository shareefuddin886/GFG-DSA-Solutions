class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        long totalSum = 0;
        long leftSum = 0;

        // Step 1: Find the total sum of the entire array
        for (int num : arr) {
            totalSum += num;
        }

        // Step 2: Iterate through the array to find the equilibrium point
        for (int i = 0; i < arr.length; i++) {
            // Right sum is the total sum minus what's on the left and the current element
            long rightSum = totalSum - leftSum - arr[i];

            // If left sum matches right sum, we found the balance point
            if (leftSum == rightSum) {
                return i; // 0-based indexing requested
            }

            // Update left sum for the next iteration
            leftSum += arr[i];
        }

        // Return -1 if no equilibrium point exists
        return -1;
    }
}
