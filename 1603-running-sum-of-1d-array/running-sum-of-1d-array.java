class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum=new int[nums.length];
        int i,j,k=0;
        for(i=0;i<nums.length;i++)
        {
            int add=0;
            for(j=i;j>=0;j--)
            {
                add+=nums[j];
            }
            sum[k]=add;
            k++;
        }
        return sum;
    }
}