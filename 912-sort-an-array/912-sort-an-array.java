class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
     public int[] mergeSort(int[] nums,int low, int high){
        if(low==high){
          int[] ba = new int[1];
            ba[0] = nums[low];
            return ba;
        }
        int mid  = (low+high)/2;
        int[] fsh = mergeSort(nums,low,mid);
         int[] ssh = mergeSort(nums,mid+1,high);
         return mergeTwoSortedArray(fsh,ssh);
    }
    public int[] mergeTwoSortedArray(int[] a,int[] b){
        int[] ans = new int[a.length +b.length];
        int k=0;
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                ans[k] =a[i];
                k++;
                i++;
            }
            else{
                ans[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<a.length){
            ans[k] =a[i];
            k++;
            i++;
        }
        while(j<b.length){
            ans[k]=b[j];
            k++;
            j++;
        }
        return ans;
    }
}