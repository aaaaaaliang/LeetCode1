class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int n=nums.length;
       int res=0;
       int maxCount=0;
       for(int i=0;i<n;i++){
           if(nums[i]==1){
             res++;
           }else{
               maxCount=Math.max(res,maxCount);
               res=0;
           }
       }
       return res>maxCount? res:maxCount;
    }
}
/*
给定一个二进制数组muums ，计算其中愚大连縸 1的个数
示例1:
输入: nums = [1,1,0,1,1,1]输出:3解释。开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
示例 2:
输入: nums = [1,0,1,1,0,1]输出:2

思路：创建一个哈希数组，将nums里的值加进去，再定义一个集合，在遍历这个范围，如果哈希数组中不包含这个数，就添加进去，输出这个数组
*/
