class Solution {
    public List<List<Integer>> combine(int n, int k) {
     List<List<Integer>> combines=new ArrayList<>();
     backtrack(n,k,1,new ArrayList<>(),combines);
     return combines;
    }
    private void  backtrack(int n,int k,int start,List<Integer> curr,List<List<Integer>> combines){
    if(curr.size()==k){
        combines.add(new ArrayList<>(curr));
        return;
    }
    for(int i=start;i<=n;i++){
        curr.add(i);
        backtrack(n,k,i+1,curr,combines);
        curr.remove(curr.size()-1);
    }
    }
}
/*
给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
你可以按 任何顺序 返回答案。
示例 1：
输入：n = 4, k = 2
输出：
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
示例 2：
输入：n = 1, k = 1
输出：[[1]]

思路：创建总集合 和子集，定义回溯函数找出所有组合

*/
