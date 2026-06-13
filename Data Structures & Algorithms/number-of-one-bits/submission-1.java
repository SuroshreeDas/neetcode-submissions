class Solution {
    public int hammingWeight(int n) {
        int copy=n,count=0;
        while(copy!=0){
            copy=(copy-1)&copy;
            ++count;
        }
        return count;
    }
}
