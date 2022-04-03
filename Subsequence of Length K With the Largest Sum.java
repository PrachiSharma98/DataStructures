<!--2099. Find Subsequence of Length K With the Largest Sum-->
  
  Approach :- Create a priority queue and whenever the size of priority queue exceeeds the size of k we remove the smallest element from the queue in this way we willl
  get the subsequence of size k .
    
    
  class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
  
		PriorityQueue<int[]> pq = new PriorityQueue<int[]> ((a,b) -> (a[0] - b[0]));
		for(int i=0;i<nums.length;i++) {
			pq.offer(new int[]{nums[i] , i});
			if(pq.size()>k){
				pq.poll();
			}
		}

		Set<Integer> index = new HashSet<>();


		while(!pq.isEmpty()){
			int[] top = pq.poll();
			index.add(top[1]);
		}
		int[] ans = new int[k];
		int p = 0;
		for(int i=0;i<nums.length;i++){
			if(index.contains(i)){
				ans[p] = nums[i];
				p++;
			}
		}
		return ans;
        
    }
}
