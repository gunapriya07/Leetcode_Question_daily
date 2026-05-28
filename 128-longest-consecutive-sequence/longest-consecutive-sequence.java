class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxLongest = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int count = 0;
                while(set.contains(currentNum)){
                    currentNum++;
                    count++;
                }
                maxLongest = Math.max(maxLongest,count);
            }
        }
        return maxLongest;
        
    }
}