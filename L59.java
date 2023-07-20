从尾到头打印链表
输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

示例 1：

输入：head = [1,3,2]
输出：[2,3,1]

-----------------/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
      ListNode cur=head;
      List<Integer> list=new ArrayList<>();
      while(cur!=null){
         list.add(cur.val);
         cur=cur.next;
      }
      Collections.reverse(list);
     return  list.stream().mapToInt(Integer::intValue).toArray();
     

    }
}
思路：创建集合，然后遍历链表，将其添加进去，翻转链表
