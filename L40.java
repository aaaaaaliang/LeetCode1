class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) {
            return true;
            }
    
    for(int i=0,j=0;i<t.length();i++){
        if(s.charAt(j)==t.charAt(i)){
            j++;
        }
        if(j==s.length()){
         return true;
        }
    }
    return false;
}

}


/*
给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
进阶：
如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
示例 1：
输入：s = "abc", t = "ahbgdc"
输出：true
示例 2：
输入：s = "axc", t = "ahbgdc"
输出：false
思路：双指针，遍历字符串，找出相同的元素，找到相同的，自增，然后如果指针的长度等于子序列的长度，说明是子序列，否则返回false
*/
