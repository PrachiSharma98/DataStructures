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
