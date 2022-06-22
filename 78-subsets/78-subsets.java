class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> list = new ArrayList();
        solve(0,nums,list, ans);
        return ans; 
    }
    public void solve(int idx, int[] nums,List<Integer> list,List<List<Integer>> ans){
        if(idx==nums.length){
            ans.add(new ArrayList(list));
            return ;
        }
        // do not add the current number to the subset
        solve(idx+1,nums,list,ans);
        list.add(nums[idx]);
        solve(idx+1,nums,list,ans);
        list.remove(list.size()-1);
    }
}