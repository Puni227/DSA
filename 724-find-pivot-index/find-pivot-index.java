class Solution {
    public int pivotIndex(int[] nums) {
        for(int n=0;n<nums.length;n++)
        {
        int left=0,right=0;
        for(int i=0;i<n;i++)
        {
            left+=nums[i];
        }
        for(int i=n+1;i<nums.length;i++)
        {
            right+=nums[i];
        }
        if(left==right)
        {
            return n;
        }
        }
    return -1;
    }
}