数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
示例 1：

输入：n = 3
输出：["((()))","(()())","(())()","()(())","()()()"]
示例 2：

输入：n = 1
输出：["()"]

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n, n, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int leftCount, int rightCount, StringBuilder path, List<String> result) {

        if (leftCount == 0 && rightCount == 0) {
            result.add(path.toString());
            return;
        }

        if (leftCount > 0) {
            path.append('('); 
            backtrack(leftCount - 1, rightCount, path, result); 
            path.deleteCharAt(path.length() - 1); 
        }
        if (rightCount > leftCount) {
            path.append(')'); 
            backtrack(leftCount, rightCount - 1, path, result); 
            path.deleteCharAt(path.length() - 1); 
        }
    }
}
思路：定义一个集合存放结果，在定义一个回溯函数，首先判断左右两边的括号都用完了，说明成功，添加进集合中，然后判断左右括号是否有剩余
