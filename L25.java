class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permute = new ArrayList<>();
        back(nums, new ArrayList<>(), permute);
        return permute;
    }

    private void back(int[] nums, List<Integer> current, List<List<Integer>> permute) {
        if (current.size() == nums.length) {
            permute.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (current.contains(nums[i])) {
                continue;
            }
            current.add(nums[i]);
            back(nums, current, permute);
            current.remove(current.size() - 1);
        }
    }
}
/*
给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
示例 1：
输入：nums = [1,2,3]
输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
示例 2：
输入：nums = [0,1]
输出：[[0,1],[1,0]]
示例 3：
输入：nums = [1]
输出：[[1]]

思路：创建总集合  子集合 定义一个回溯函数 遍历数组，判断是否包含num第i个，有就继续，添加进子集 递归 更新num的值
*/
