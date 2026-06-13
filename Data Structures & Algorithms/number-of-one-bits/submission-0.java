class Solution {
    public int hammingWeight(int n) {
        int num,copy=n,count=0,i=0;
        while(copy!=0){
            copy=(copy-1)&copy;
            ++count;
        }
        return count;
    }
}
