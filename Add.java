class Solution {
    public int subtractProductAndSum(int n) {
        int s=0;
        int m=1;
        int sub=0;
        int d=0;
        while(n!=0){
      d= n%10;
         s=s+d;
        m=m*d;
        n=n/10;
        }
        sub=m-s;
        return sub;
        
        
    }
  
}
 
