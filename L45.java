给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。

示例 1：

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode p=head;
     int count=0;
     while(p!=null){
         p=p.next;
         count++;
     }
     int righti=count-n;
     if(righti==0){
         return head.next;
     }

     ListNode p1=head;
     for(int i=0;i<righti-1;i++){
         p1=p1.next;
     }
     p1.next=p1.next.next;
     return head;
    }

}
输入：head = [1,2,3,4,5], n = 2
输出：[1,2,3,5]
示例 2：

输入：head = [1], n = 1
输出：[]
示例 3：

输入：head = [1,2], n = 1
输出：[1]

思路：首先遍历一遍获得总共有多长 找到这个元素的前面一个让它指向下下个
