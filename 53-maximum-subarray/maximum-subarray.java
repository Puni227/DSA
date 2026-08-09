class Solution {
    public int maxSubArray(int[] nums) {
        int i=0,max=nums[0];
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum>max) max=sum;
                if(sum<0) sum=0;
            }
        
        return max;
    }
}