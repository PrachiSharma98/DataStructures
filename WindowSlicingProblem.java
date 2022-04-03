<!--Given an array of integers and a number k,find the maximum sum of k consecutive elemnts.
  I/p:-[1,8,30,-5,20,7]
  o/p:-45
   -->
    
    int curr_sum=0;
for(int i=0;i<k;i++)
  curr_sum+=arr[i];
int max_sum=curr_sum;

for(int i=k;i<n;i++)
{
  curr_sum+=(arr[i]-arr[i-k]);
  max_sum=Math.max(max_sum,curr_sum);
}
return max_sum;
