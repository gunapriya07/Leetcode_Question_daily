class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        HashSet<Integer> result = new HashSet<>();
        for(int nums : nums2){
            if(set.contains(nums)){
                result.add(nums);
            }
        }
        int[] result1 = new int[result.size()];
        int i = 0;
        for(int num : result){
            result1[i] = num;
            i++; 
        }
        return result1;
        
    }
}