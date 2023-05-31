class Solution {
        public int lengthOfLastWord(String s) {
            s=s.trim();
            int lastSpace=s.lastIndexOf(' ');
            if(lastSpace==-1){
                return s.length();
            }
            int length = s.length() - lastSpace-1;
            return length;
        }
    }
/*
给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
示例 1：
输入：s = "Hello World"
输出：5
解释：最后一个单词是“World”，长度为5。
示例 2：
输入：s = "   fly me   to   the moon  "
输出：4
解释：最后一个单词是“moon”，长度为4。
示例 3：
输入：s = "luffy is still joyboy"
输出：6
解释：最后一个单词是长度为6的“joyboy”。

思路：首先调用trim方法去除首尾空格，然后找到最后一个空格出现的位置，然后最后一个单词的长度就等于总长度-最后一个空格之前单词的长度再减去1
*/
