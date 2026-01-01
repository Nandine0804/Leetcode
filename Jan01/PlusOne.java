Problem Summary:
------------------
We are given a number represented as an array of digits, ordered from most significant to least significant, with no leading zeros. 
Our task is to add one to this number and return the updated number in the same array format, correctly handling carry-over when digits are 9.

Constraints:
-----------------
1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.


--------------- Sample output ----------------------
Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].


------------------- Code ----------------------------
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If all digits were 9
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}

--------------------------------------------------------

  Time complexity : O(N)
  Space Complexity : O(1)
  
