给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。

请你将两个数相加，并以相同形式返回一个表示和的链表。

你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
示例 1：


输入：l1 = [2,4,3], l2 = [5,6,4]
输出：[7,0,8]
解释：342 + 465 = 807.
示例 2：

输入：l1 = [0], l2 = [0]
输出：[0]
示例 3：

输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
输出：[8,9,9,9,0,0,0,1]

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode dummy=new ListNode(0);
     ListNode p1=l1;
     ListNode p2=l2;
     ListNode pre=dummy;
     int carry=0;
     while(p1!=null||p2!=null){
         int x=(p1!=null)?p1.val:0;
         int y=(p2!=null)?p2.val:0;
         int sum=x+y+carry;
         carry=sum/10;
         pre.next=new ListNode(sum%10);
         pre=pre.next;
         if(p1!=null) p1=p1.next;
         if(p2!=null) p2=p2.next;
     }
     if(carry>0){
         pre.next=new ListNode(carry);
     }
     return dummy.next;
    }
}
思路：先建一条链表去存储这两条链表相加的值，创建一个链表名为dummy,在创建一个头节点，两个指针分别指向l1,l2，在新建一个carry用来表示进位，执行相应的逻辑
