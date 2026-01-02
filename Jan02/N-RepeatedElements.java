Given the constraints, there is exactly one element that appears n times, and all others appear once.
------------------------------
nums.length = 2n

- There are n + 1 unique elements
- One element appears n times → it must dominate the array
- So the answer is simply the element whose frequency > 1.

-------------------------- Code ----------------------------------
  class Solution {
    public int repeatedNTimes(int[] nums) {
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i) ==len/2){
                return i;
            }
        }
        return 1;
    }
}

-------------------- Best Practice ------------------------------
  
  class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }
}

-----------------------------------------------------------------

  Time Complexity : 0(N)
  Space Complexity : O(N);
