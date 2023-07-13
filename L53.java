从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。

示例 1:

输入: [1,2,3,4,5]
输出: True
 

示例 2:

输入: [0,0,1,2,5]
输出: True

class Solution {
    public boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int numMin = 14;
        int numMax = 0;
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
            numMax = getMax(numMax, num);
            numMin = getMin(numMin, num);
        }
        return numMax - numMin < 5;
    }
    
    private int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    private int getMin(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
思路：创建一个哈希集合，定义两个遍历，记录最大值和最小值，最后判断最大值和最小值是否小于5判断是否是一个顺子
