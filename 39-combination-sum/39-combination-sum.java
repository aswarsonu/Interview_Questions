class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       
        ArrayList<Integer> list = new ArrayList<>();
        
        List<List<Integer>> ans = new ArrayList<>();
        comboSum(0,target,list,ans,candidates);
        return ans;
        
    }
    public void comboSum(int idx,int target,List<Integer> list,List<List<Integer>> ans,int[] arr){
       if( target ==0){
           ans.add(new ArrayList(list));
           
       } 
        else if(target<0){
            return;
        }
        for(int i=idx;i<arr.length;i++){
            list.add(arr[i]);
            comboSum(i,target-arr[i],list,ans,arr);
            list.remove(list.size()-1);
        }
    }
}