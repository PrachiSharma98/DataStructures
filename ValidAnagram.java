class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character, Integer> map = new HashMap<>();
     for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(int i=0;i<t.length();i++)
        {
            char c =t.charAt(i);
            if(map.containsKey(c))
            {
               map.put(c,map.getOrDefault(c,0)-1);
            }
             else{
                map.put(c,1);
            }
           
        }
        
        for(Integer value: map.values()) {
      
        if(value!=0)
            return false;
    }
        
        return true;
        
        
        
        
