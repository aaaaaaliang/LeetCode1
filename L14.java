class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
    while(n!=1){
        if(set.contains(n)){
            return false;
        }
        set.add(n);
         n=fun(n);
    }
    return true;
    }
    public int fun(int n){
  String s=String.valueOf(n);
  char[] chars=s.toCharArray();
  int sum=0;
  for(char c:chars){
      sum+=(c-'0')*(c-'0');
  }
  return sum;
    }
}
/*
题目描述：编写一个算法来判断一个数 n 是不是快乐数。
「快乐数」 定义为：
对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
如果这个过程 结果为 1，那么这个数就是快乐数。
如果 n 是 快乐数 就返回 true ；不是，则返回 false 。

示例 1：
输入：n = 19
输出：true
解释：
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
示例 2：
输入：n = 2
输出：false

思路：创建一个hash集合，循环结束的条件是n=1，如果set里包含n，返回false，
否则添加进set集合中，定义一个方法，将n转化为字符串，添加进char数组，遍历数
组，强转然后平方求和
*/
