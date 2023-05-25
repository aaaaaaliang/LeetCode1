class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> subsets=new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }
    private void backtrack(int[] nums,int start,List<Integer> currentSubset,List<List<Integer>> subsets){
        subsets.add(new ArrayList<>(currentSubset));//将子集添加进二维集合中
        for(int i=start;i<nums.length;i++){
         currentSubset.add(nums[i]);
         backtrack(nums, i + 1, currentSubset, subsets);  // 递归生成下一个子集，从下一个元素开始
            currentSubset.remove(currentSubset.size() - 1);  // 回溯，将当前元素从当前子集中移除
        }
    }
    
}
/*
给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
示例 1：
输入：nums = [1,2,3]
输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
示例 2：
输入：nums = [0]
输出：[[],[0]]

思路：定义一个回溯函数，里面参数是数组，首位数字，子集，总集合，遍历数组，将nums[i]添加进子集中，递归生成下一个子集，生成完回溯，把递归生成的那一个删除掉
*/
