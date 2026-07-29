class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums1=nums.clone();
        int[] sum=new int[nums.length + nums1.length];

        int k=0;

        for(int i=0;i<nums.length;i++)
        {
            sum[k]=nums[i];
            k++;
        }
        for(int i=0;i<nums1.length;i++)
        {
            sum[k]=nums1[i];
            k++;
        }
        return sum;

    }
}