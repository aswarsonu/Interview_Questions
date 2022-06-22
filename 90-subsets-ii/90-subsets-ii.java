class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans = new HashSet();
        List<Integer> list = new ArrayList();
        Arrays.sort(nums);
        solve(nums, 0, list, ans);
        return new ArrayList(ans);
    }
    public void solve(int[] nums,int idx,List<Integer> list,Set<List<Integer>> ans){
        if(idx==nums.length){
            ans.add(new ArrayList(list));
            return;
        }
        
        solve(nums,idx+1,list,ans);
        list.add(nums[idx]);
        solve(nums,idx+1,list,ans);
        list.remove(list.size()-1);
    }
}