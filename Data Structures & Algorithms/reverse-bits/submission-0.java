class Solution {
    public int reverseBits(int n) {
       int res=0,i;
       for(i=0;i<32;i++)
       {
        res=res<<1;//shift result left
        res|=(n&1);//add last bit of n
        n=n>>1;//shift n right
       }
       return res;
    }
}
