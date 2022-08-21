arr=[5,10,12,80]
for(int i=0;i<n;i++)
  for(int j=i+1;j<n;j++)
    if(arr[j]>arr[i])
      return false;
return true
  
  
  //efficient approach
  for(int i=1;i<n;i++)
    if(a[i]>a[i-1])
      return false;
return true;
