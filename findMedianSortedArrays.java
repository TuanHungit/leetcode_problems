Link: https://leetcode.com/problems/median-of-two-sorted-arrays
Description: Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       if(nums1.length>nums2.length)
           return findMedianSortedArrays(nums2,nums1);
       
        int m=nums1.length;
        int n=nums2.length;
        
        int start=0,end=m;
        
        while (true)
        {
            int mid1=(end+start)/2;
            int mid2=(m+n+1)/2-mid1;
            
            int left1=mid1==0?Integer.MIN_VALUE:nums1[mid1-1];
            int left2=mid2==0?Integer.MIN_VALUE:nums2[mid2-1];
            
            int right1=mid1==m?Integer.MAX_VALUE:nums1[mid1];
            int right2=mid2==n?Integer.MAX_VALUE:nums2[mid2];
            
            if(left1<=right2 && left2<=right1)
            {
                if((m+n)%2==0)
                    return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                else
                    return Math.max(left1,left2)/1.0;
            }
            else if(left1>right2)
            {
                end=mid1-1;
            }
            else
            {
                start=mid1+1;
            }
                
        }
    }
}