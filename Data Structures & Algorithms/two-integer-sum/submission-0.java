class Solution {
    public int[] twoSum(int[] nums, int target) {
        int dif;
        Map<Integer,Integer> index = new HashMap<>(); 
        for(int i = 0; i < nums.length; i++) {
            dif=target-nums[i];
            if(index.containsKey(dif))
              {
                return new int[]{index.get(dif),i};
              }  
               index.put(nums[i],i);
            }      
           
       throw new IllegalArgumentException("No two sum solution");
    }
}
