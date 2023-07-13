给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
示例 1：

输入：nums1 = [1,2,2,1], nums2 = [2,2]
输出：[2]
示例 2：

输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出：[9,4]
解释：[4,9] 也是可通过的

  class Solution  {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        
        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index++] = num;
        }
        
        return result;
    }
}
思路：创建哈希集合去重，将nums1中的元素存储到set1中，然后遍历nums2，
如果元素存在于set1中，则加入set2。最后，将set2中的元素转换为数组并返回
