class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(nums,0,result,new ArrayList<>());
        return result;
    }
    public void backtracking(int[] nums,int index,List<List<Integer>> result,List<Integer> current){
        result.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            backtracking(nums,i+1,result,current);
            current.remove(current.size()-1);
        }
    }
}