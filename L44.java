
给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
示例 1：

输入：head = [1,2,3,4]
输出：[2,1,4,3]
示例 2：

输入：head = []
输出：[]
示例 3：

输入：head = [1]
输出：[1]

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
     
     ListNode dummy=new ListNode(0);
     dummy.next=head;

     ListNode current=dummy;
     while(current.next!=null&&current.next.next!=null){

         ListNode first=current.next;
         ListNode second=current.next.next;

         first.next=second.next;
         second.next=first;

        current.next=second;
         current=current.next.next;
     }
     return dummy.next;
    }
}

思路：new一个头，让它指向头节点，然后while循环，让第一个和第二个交换，然后更新指针即可
