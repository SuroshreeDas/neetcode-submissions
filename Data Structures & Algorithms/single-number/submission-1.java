class Solution {
    public int singleNumber(int[] nums) {
      Set <Integer> intset= new HashSet<>();
      int j=0;
      for (int i=0;i<nums.length;i++){
        j^=nums[i];}
      return j;
    }
}
