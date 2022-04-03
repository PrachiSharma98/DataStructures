<!--27. Remove Element-->



class Solution {
    public int removeElement(int[] nums, int val) { //1,1,2,3,4,1 val=1
        int element=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[element]=nums[i];
                element++;
            }
        }
        return element;
    }
}
