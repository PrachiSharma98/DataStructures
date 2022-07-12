class Solution {
   
        
        
        public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 0){
            return new int[]{-1, -1};
        }


        for (int index = 0; index < nums.length; index++) {
            for (int secondIndex = index+1; secondIndex < nums.length; secondIndex++) { //index+1 because it will be able to move to next index else 1,1
                if (nums[index] + nums[secondIndex] == target){
                    return new int[]{index, secondIndex};
                }
            }
        }

        return new int[]{-1, -1};
    }
        
    
}


Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
