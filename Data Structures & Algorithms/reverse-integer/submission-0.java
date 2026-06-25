class Solution {
    public int reverse(int x) {
        int copy=x,digit=0;
        long rev=0;
        while(copy!=0)
        {
            digit=copy%10;
            rev=rev*10+digit;
            copy/=10;
        }
        System.out.println(rev);
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE)
            return 0;
        else
            return (int)rev;
    }
}
