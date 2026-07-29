class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length-k,m=0;
        int[] sum=new int[nums.length];
        for(int i=n;i<nums.length;i++)
        {
            sum[m]=nums[i];
            m++;
        }
        for(int i=0;i<n;i++)
        {
            sum[m]=nums[i];
            m++;
        }
        for (int i = 0; i < nums.length; i++) {
    nums[i] = sum[i];
}
        return;
    }
}