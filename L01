class Solution {
    public char findTheDifference(String s, String t) {
     char[] sChars=s.toCharArray();
     char[] tChars=t.toCharArray();
     Arrays.sort(sChars);
     Arrays.sort(tChars);
     for(int i=0;i<s.length();i++){
         if(sChars[i]!=tChars[i]){
             return tChars[i];
            
         }
     }
     return tChars[s.length()];
    }
}
/*
给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
注意: 若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
示例 1:
输入: s = "anagram"，t ="nagaram"
输出: true

示例 2:
输入: s =“rat",t =“car"
输出: false


思路：先判断长度是否相等，然后将其转换成字符存在数组中，然后调用sort方法，然后用equals方法判断

*/
