<!--26. Remove Duplicates from Sorted Array-->
class Solution {
    public int removeDuplicates(int[] nums) {
      Set<Integer> st = new TreeSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            st.add(nums[i]);
               
        i = 0;
    Iterator itr = st.iterator();
         while(itr.hasNext())
            nums[i++] = (Integer) itr.next();
        
        
        }
        return st.size();
    }
}
