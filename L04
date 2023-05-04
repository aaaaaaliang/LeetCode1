class Solution {
    public int addDigits(int num) {
        boolean loop = true;
        int sum = 0;
        while(loop) {
            sum += num % 10;//先找出num的余数
            num = num / 10;//用整数部分替换原先的sum
            if (num < 10) {//如果是个位数，
                sum = sum + num%10;
                if (sum >= 10) {  //判断是否为个位数，不是个位数继续执行
                    num = sum;//当sum大于10时，把sum的值赋给num
                    sum = 0;//构成新一轮的循环
                } else {//说明sum已经小于10了
                    loop = false;//当为各位数结束循环
                }
            }
        }
        return sum;
    }
}
/*
给定一个非负整数 num ，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
示例 1:
输入: num = 38输出: 2
解释:各位相加的过程为:38 --> 3 + 8 --> 1111--> 1+1-> 2由于 2 是一位数，所以返回 2。
示例 2:
输入: num = 0输出:0

思路：先找出num的余数，用整数部分替换原先的sum，如果是个位数，
处理完再判断是否为个位数，不是个位数继续执行，当sum大于10时，把s
um的值赋给num，负责结束循环

*/
