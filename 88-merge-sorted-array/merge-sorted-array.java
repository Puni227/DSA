class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m;
        for(int i=0;i<n;i++)
        {
            nums1[k]=nums2[i];
            k++;
        }
     
        int temp=0;
        for(int i=0;i<m+n-1;i++)
        {
            for(int j=i+1;j<m+n;j++)
            {
                if(nums1[i]>nums1[j])
                {
                    temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
        return;
    }
}