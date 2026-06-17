class Solution {
    public int findMin(int[] nums) {
        int low=0;int min=0;
        int high=nums.length-1;
        while(low<=high)
        {
            min=low+(high-low)/2;
           if(nums[high]<=nums[min])
                low=min+1;
            else if(nums[min]<nums[low])
            {
                if(nums[min-1]>nums[min])
                    return nums[min];
                else 
                   {  high=min;
                        }
            }
            else 
            {
                high=min-1;
            }

        }
        return nums[min];
    }
}
