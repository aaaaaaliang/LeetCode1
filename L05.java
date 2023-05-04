class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
int[] letter1=new int[128];
int[] letter2=new int[128];
for(int i=0;i<ransomNote.length();i++){
    letter1[ransomNote.charAt(i)]++;
}
for(int i=0;i<magazine.length();i++){
    letter2[magazine.charAt(i)]++;
}
for(int i=0;i<ransomNote.length();i++){
    if(letter1[ransomNote.charAt(i)]>letter2[ransomNote.charAt(i)]){
        return false;
    }
}
return true;
    }
}
/*
给你两个字符串: ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
如果可以，返回 true ;否则返回 false .
magazine 中的每个字符只能在 ransomNote 中使用一次。
示例 1:
输入: ransomNote = "a"， magazine = "b"输出: false
示例 2:
输入: ransomNote = "aa"，magazine ="ab"输出: false
示例 3:
输入: ransomNote = "aa", magazine = "aab"输出: true

思路：两次遍历记录字母出现的次数，保证第一个数组出现的次数小于第二个数组出现的次数

*/
