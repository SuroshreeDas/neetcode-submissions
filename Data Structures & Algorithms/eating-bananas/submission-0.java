class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minspeed=1,maxspeed; 
        int i,max=piles[0],mid;
        for(i=1;i<piles.length;i++)
        {
            if(piles[i]>max)
            {
                max=piles[i];
            }
        } 
        maxspeed=max;
        while(minspeed<maxspeed)
        {
            mid=minspeed+(maxspeed-minspeed)/2;
            if(canEatInTime(mid,piles,h))
               { maxspeed=mid;}
            else 
               { minspeed=mid+1;}
        }
        return minspeed;
    }
    private boolean canEatInTime(int mid,int piles[],int h){
        int hours=0;
        int i,speed=mid;
        for(i=0;i<piles.length;i++)
        {
            hours+=(int)Math.ceil((double)piles[i]/speed);
        }
        return hours<=h;
    }
}
