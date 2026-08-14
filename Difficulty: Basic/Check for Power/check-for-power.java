class Solution {
    public boolean isPower(int x, int y) {
        // Guard clauses to prevent infinite loops
        if (x == 0) return (y == 0); 
        if (x == 1) return (y == 1);
        if (y == 1) return true; // Any x^0 = 1

        // Single loop: Start directly at x (which is x^1)
        for (long i = x; i <= y; i = i * x) {
            if (i == y) return true;
        }
        
        return false;
    }
}
