class Solution {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        int a = 0;
        int b = 1;
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        else return (helper(0,1,n));
    }
    
    private int helper(int a, int b, int n) {
        if (n == 3) {
            return a + b;
        }
        
        return helper(b, a + b, n - 1); 
        
        /* recursive solution, now we eliminate the first element, now the subproblem comes to calculate the (n-1) elements */
    }
}

