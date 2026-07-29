class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum=new int[nums.length];
        int i,j;
        for(i=0;i<nums.length;i++)
        {
            int add=0;
            for(j=i;j>=0;j--)
            {
                add+=nums[j];
            }
            sum[i]=add;
            
        }
        return sum;
    }
}