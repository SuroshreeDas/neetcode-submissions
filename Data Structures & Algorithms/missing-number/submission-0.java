class Solution {
    public int missingNumber(int[] nums) {
        int i,sum1=nums.length,sum2=0;
        for(i=nums.length-1;i>=0;i--){
            sum1=sum1+i;
            sum2=nums[i]+sum2;
        }
        return sum1-sum2;
    }
}
