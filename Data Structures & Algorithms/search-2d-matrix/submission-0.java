class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length, m=matrix.length;
        int lower=0,mid;
        int upper=m*n-1;
        boolean flag=false;
                while(lower<=upper)
                 {
                    mid=lower+(upper-lower)/2;
                    int row=mid/n, col=mid%n;
                    if(matrix[row][col]==target)
                        return flag=true;
                    else if (matrix[row][col]<target)
                        lower=mid+1;
                    else 
                        upper=mid-1;
                 }//while loop end                            
        return flag;//if not found
    }//end of method
}//end of class
