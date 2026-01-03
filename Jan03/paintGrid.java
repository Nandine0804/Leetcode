Paint Grid With Three Colors (DP)
----------------------------------------------
We need to count the number of ways to paint an n × 3 grid using 3 colors (Red, Yellow, Green) such that no two adjacent cells (horizontal or vertical) share the same color.
Since the result can be large, return it modulo 10⁹ + 7.

-------------------------------------------------------
Key Observation

Each row can be painted in two valid patterns:
ABC pattern – all 3 cells have different colors
→ 6 ways per row
ABA pattern – first and third cells have the same color
→ 6 ways per row
So for n = 1, total ways = 6 + 6 = 12.
---------------------------------------------------------
🔁 Dynamic Programming

Let:
A = number of ways to paint up to current row using ABC pattern
B = number of ways to paint up to current row using ABA pattern

  ------------------------ Code ----------------------------
  class Solution {
    public int numOfWays(int n) {
        final int MOD = 1_000_000_007;
        long A = 6, B = 6;
        for (int i = 2; i <= n; i++) {
            long newA = (2 * A + 2 * B) % MOD;
            long newB = (2 * A + 3 * B) % MOD;
            A = newA;
            B = newB;
        }
        return (int) ((A + B) % MOD);
    }
}

------------------------------------------------------------------
  Time Complexity : O(N)
  Space Complexity : O(1)
