class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> intset = new HashSet<>(); 
        for(int i = 0; i < nums.length; i++) {
                if(intset.contains(nums[i])) {
                    return true;
                }
                intset.add(nums[i]);
            }
        return false;
     }
}