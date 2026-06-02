class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int lower=0;
        int upper=nums.length-1;
        int mid;
        while(lower<=upper)
        {
            mid=lower+(upper-lower)/2;
            if(nums[mid]==target)
                return mid;
            else if (nums[mid]<target)
                lower=mid+1;
            else 
                upper=mid-1;
        }
        return -1;//if not found
    }
}
