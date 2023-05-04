class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] res=new int[nums1.length];
    for(int i=0;i<nums1.length;i++){
        int j=0;
        for(;j<nums2.length;j++){
            if(nums2[j]==nums1[i]){
                break;
            }
        }
        while(j<nums2.length){
          if(nums2[j]>nums1[i]){
              res[i]=nums2[j];
              break;
          }else{
              j++;
          }
        }
        if(j==nums2.length){
            res[i]=-1;
        }
    }
    return res;

    
    }
}
/*

思路：先定义一个数组，数组的长度是nums1的长度，先遍历nums1，在遍历nums2，找到元素相同的值，然后在遍历nums2后面的数组，判断有没有大于这个元素的，有就添加到数组中，没有就返回-1
*/
