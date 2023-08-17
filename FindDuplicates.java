class Solution {
    public int findDuplicate(int[] nums) {
        int[] hash = new int[nums.length];
        int num=0;
        for(int i=0;i<nums.length;i++)
        {
            hash[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
        if(hash[i] == 2)
      num = i;
        }
        return num;
    }
}

O(2N)
