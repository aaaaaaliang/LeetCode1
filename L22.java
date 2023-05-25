class Solution {
    public String[] findRelativeRanks(int[] score) {
     Map<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<score.length;i++) map.put(score[i],i);
     Arrays.sort(score);
     String[] ans=new String[score.length];
     for(int i=0;i<score.length;i++){
         int s=map.get(score[i]);
         if(i==score.length-1)  ans[s]="Gold Medal";
         else if(i==score.length-2)  ans[s]="Silver Medal";
         else if(i==score.length-3)  ans[s]="Bronze Medal";
         else ans[s]=String.valueOf(score.length-1);
     }
     return ans;
    }
}
/*
题目描述：给你一个长度为 n 的整数数组 score ，其中 score[i] 是第 i 位运动员在比赛中的得分。所有得分都 互不相同 。
运动员将根据得分 决定名次 ，其中名次第 1 的运动员得分最高，名次第 2 的运动员得分第 2 高，依此类推。运动员的名次决定了他们的获奖情况：
名次第 1 的运动员获金牌 "Gold Medal" 。
名次第 2 的运动员获银牌 "Silver Medal" 。
名次第 3 的运动员获铜牌 "Bronze Medal" 。
从名次第 4 到第 n 的运动员，只能获得他们的名次编号（即，名次第 x 的运动员获得编号 "x"）。
使用长度为 n 的数组 answer 返回获奖，其中 answer[i] 是第 i 位运动员的获奖情况。

思路：定义一个hashmap集合，先将数据存进去，在对数组进行排序，遍历，赋值，最后返回数组
*/

