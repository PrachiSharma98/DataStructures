<!--A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.-->


class Solution 
{
    public boolean checkIfPangram(String sentence) 
    {
        HashSet<Character> mySet = new HashSet();
        boolean output = false; 
        
        for(int i=0;i<sentence.length(); i++)
        {
            if(!mySet.contains(sentence.charAt(i)) )
            {
                 mySet.add(sentence.charAt(i));
            }
        }
        
        if(mySet.size() == 26)
        {
            output = true; 
        }   
        
        return output;
    }
}
