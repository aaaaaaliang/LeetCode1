给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
示例 1：

输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
输出：6
解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 
示例 2：

输入：height = [4,2,0,3,2,5]
输出：9
  
class Solution {
    public int trap(int[] height) {
        if(height==null||height.length==0){
            return 0;
        
        }
         int left=0;
         int right=height.length-1;
         int leftMax=0;
         int rightMax=0;
         int water=0;
         while(left<right){
             if(height[left]<=height[right]){

                 if(height[left]>leftMax){
                     leftMax=height[left];
                 }else{
                     water=water+leftMax-height[left];
                 }
                 left++;
             }else{
                 if(height[right]>rightMax){
                     rightMax=height[right];
                 }else{
                     water=water+rightMax-height[right];
                 }
                 right--;
             }
         }
         return water;
    }
}
  
思路：双指针，通过比较左右指针指的柱子高度，确定能够接到的雨水量。对于当前位置的柱子，其雨水量取决于较低的那个，并将其与当前柱子的高度相减得到雨水量，然后不断更新最大高度
