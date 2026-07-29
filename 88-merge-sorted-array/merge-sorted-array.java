class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m;
        int l=m+n;
        for(int i=0;i<n;i++)
        {
            nums1[k]=nums2[i];
            k++;
        }
     
        int temp=0;
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
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