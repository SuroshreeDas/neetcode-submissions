class Solution {
    public boolean isHappy(int n) {
       if(n>=0)
       {
            int copy=n, sum=0, d;
            Set<Integer> intset= new HashSet<>();
            while(true){
                while(copy!=0)
                {
                    d=copy%10;
                    sum+=Math.pow(d,2);
                    copy=copy/10;
                }
                if(intset.contains(sum))
                {
                    return false;
                }
                intset.add(sum);
                if(sum==1){
                    return true;
                }
                else{
                    copy=sum;
                    sum=0;
                    continue;
                }
            }
       
       } 
      else
      {
        return false;
      }  
    }
}
