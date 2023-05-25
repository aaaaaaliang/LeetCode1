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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode mid=findMiddle(head);
        ListNode re=resverseList(mid.next);

        ListNode p1=head;
        ListNode p2=re;
        while(p2!=null){
            if(p1.val!=p2.val){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
        private ListNode findMiddle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        }
        private ListNode resverseList(ListNode head){
            ListNode pre=null;
            ListNode cur=head;
            while(cur!=null){
                ListNode next=cur.next;//定义一个指针用来存放cur的下一个指针
                cur.next=pre;//将cur与pre连接
                pre=cur;//此时再将pre的值更新为cur,这样就实现了翻转效果
                cur=next;//此时更新pre
            }
            return pre;
        }

    
}
/*
给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
示例 1：
输入：head = [1,2,2,1]
输出：true
示例 2：
输入：head = [1,2]
输出：false

思路：要判读是否回文，只需要判断前半段和后半段翻转后是否相同，此时需要找到二分之一处，将后半段翻转
*/
