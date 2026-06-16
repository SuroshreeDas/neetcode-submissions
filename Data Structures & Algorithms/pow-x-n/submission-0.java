class Solution {
    public double myPow(double x, int n) {
        double res=1;
        if(n>=0){
            for(int i=n;i>0;i--){
                res=x*res;
             }
             return res;
        }
        else if(n<0)
        {
            for(int i=n;i<0;i++){
                 res=x*res;
            }
            res=1/res;
            return res;
        }
        
        return res;
    }
}
