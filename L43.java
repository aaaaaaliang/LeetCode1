题目描述：
给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。

示例 1：


输入：root = [1,null,2,3]
输出：[1,3,2]
示例 2：

输入：root = []
输出：[]
示例 3：

输入：root = [1]
输出：[1]

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> list=new ArrayList<>();
      inorder(root,list);
      return list;


      
    }

    private void inorder(TreeNode node,List<Integer> list){
        if(node!=null){
            inorder(node.left,list);
            list.add(node.val);
            inorder(node.right,list);
        }
    }
}

思路：通过递归实现，中序遍历就是左头右，第一次出现的不添加进list集合中，第二次出现的添加进去
