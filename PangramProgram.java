class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
       boolean flag = true;
        for(char ch ='a'; ch <='z' ;ch++)
        {
            if(!sentence.contains(String.valueOf(ch)))
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
}
