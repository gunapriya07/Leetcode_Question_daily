class Solution {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        int coverage = 0, lastIndex = 0;
        int totalJump = 0;
        int destination = nums.length-1;
        for(int i=0;i<nums.length;i++){
            coverage = Math.max(coverage,nums[i]+i);

            if(i==lastIndex){
                totalJump++;
                lastIndex = coverage;

                if(lastIndex>=destination){
                    return totalJump;
                }
            }
        }
        return totalJump;
    }
}