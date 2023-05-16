class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode current=head;
        ListNode prev=dummy;
        while(current!=null){
            if(current.val==val){
                prev.next=current.next;
            }else{
                prev=current;
            }
            current=current.next;
        }
        return dummy.next;
    }
}

/*
题目描述：203. 移除链表元素
给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
示例 1：
输入：head = [1,2,6,3,4,5,6], val = 6
输出：[1,2,3,4,5]
示例 2：
输入：head = [], val = 1
输出：[]
示例 3：
输入：head = [7,7,7,7], val = 7
输出：[]

思路：定义一个指针current指向head，在定义一个指针prev指向在current之前，遍历链表，如果值等于目标值，把链子断了，
prev直接指向current的下一个否则更新指针
*/
