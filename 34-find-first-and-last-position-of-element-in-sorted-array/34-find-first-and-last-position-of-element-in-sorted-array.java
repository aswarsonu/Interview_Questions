class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int i=0,j=n-1;
        int ans[] = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        while(i<n && (nums[i]!=target) ){
            
            i++;
            
        }
        if(i==n){
            return ans;
        }
        ans[0]=i;
          
        while(j>=0 && nums[j]!=target ){
            
            j--;
            
            
        }
        ans[1]=j;
        
        return ans;
    
    }
}