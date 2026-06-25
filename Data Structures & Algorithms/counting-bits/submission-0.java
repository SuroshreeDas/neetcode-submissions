class Solution {
    public int[] countBits(int n) {
       int count=0,i,res[]=new int[n+1];
       res[0]=0;
       for(i=1;i<=n;i++){
        String bin=Integer.toBinaryString(i);
        res[i]=countOnes(bin);
       } 
       return res;
    }
    public int countOnes(String num){
        int count=0;
        for(int i=0;i<num.length();i++){
            if (num.charAt(i)=='1')
                count ++;
        }
        return count;
    }
}
