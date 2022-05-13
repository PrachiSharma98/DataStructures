<!--
  Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"-->
  
  
  class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=0;i<strs.length;i++)
        {
            //here starting from the 2nd string in the array
        //we will check if the prefix occurs in individual string or not
        //if prefix doesn't occur we will reduce the prefix by 1 until a matching
        //prefix is found in each string
            while(strs[i].indexOf(prefix)!=0)
            {
                prefix = prefix.substring(0,prefix.length() - 1);
            }
        }
        return prefix;
    }
}
