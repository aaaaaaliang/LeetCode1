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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode vir = new ListNode(-1);
        ListNode pre = vir;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                pre.next = list2;
                list2 = list2.next;
            } else {
                pre.next = list1;
                list1 = list1.next;
            }
            pre = pre.next;
        }
        if (list1 != null) {
       pre.next=list1;
        }
        if(list2!=null){
            pre.next=list2;
        }
       return vir.next;
    }
}

/*
题目描述：将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
示例 1:
输入: l1 = [1,2,4]，12 = [1,3,4]输出:[1,1,2,3,4,4]
示例 2:
输入: 11 = []，12 =[]输出: []

思路：先设置一个虚拟节点vir，在设置一个指针pre指向vir，设置循环比较两个链表中值的大小，
让指针指向值小的节点 结束完判断是否有剩余值，如果有就把剩下的节点全部加入到指针的位置，
最后返回虚拟节点的指针
*/
