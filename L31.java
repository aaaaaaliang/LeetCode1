class Solution {
    public int firstUniqChar(String s) {
    Map<Character,Integer> map=new HashMap<>();
    for(char c:s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
    }
    for(int i=0;i<s.length();i++){
         if (map.get(s.charAt(i)) == 1) {
            return i;
        }
    }
    return -1;
    }
}
/*
给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
示例 1：
输入: s = "leetcode"
输出: 0
示例 2:
输入: s = "loveleetcode"
输出: 2
示例 3:
输入: s = "aabb"
输出: -1

思路：定义map集合，遍历，统计字符频率，在遍历找出频率为1的
*/
