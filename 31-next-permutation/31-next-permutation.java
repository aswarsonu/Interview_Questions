class Solution {
    public void nextPermutation(int[] nums) {
        
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;      
        }
        if(i>=0){
            int j=nums.length-1;
            while(j>=0 && nums[i]>=nums[j]){
                j--;
            }
            swep(nums,i,j);
        }
        reverse(nums,i+1);
        
        
    }
    public void swep(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] =nums[j];
        nums[j] =temp;
    }
    public void reverse(int[] nums ,int start){
        int j =nums.length-1;
        while(start<j){
            swep(nums,start,j);
            start++;
            j--;
        }
    }
   
}