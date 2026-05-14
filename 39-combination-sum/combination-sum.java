class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(candidates,target,0,result,new ArrayList<>());
        return result;
    }
    public void backtracking(int[] candidates,int target,int index,List<List<Integer>>result,List<Integer> current){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            current.add(candidates[i]);
            backtracking(candidates,target-candidates[i],i,result,current);
            current.remove(current.size()-1);
        }
    }
}