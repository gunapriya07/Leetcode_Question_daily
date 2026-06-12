class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }

        Collections.sort(list,(a,b)->{
             if(!map.get(a).equals(map.get(b))){
                return map.get(a)-map.get(b);
             }
             return b-a;
        });
        
        int[] result = new int[list.size()];
        for(int i=0;i<result.length;i++){
            result[i] = list.get(i);
        }

        return result;

        


        
    }
}