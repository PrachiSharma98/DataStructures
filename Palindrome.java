###Palindrome Number


class Solution {
public boolean isPalindrome(int x) {
int reverse=0,rem,m=x;
if(m < 0)
return false;

    while( m != 0)
    {
        rem= m % 10;
        reverse = reverse * 10 + rem ;
         m = m / 10 ;
    }
    if( reverse == x)
        return true;
    return false;

    
}
}




*********************
121----> 121--->Palindrome
