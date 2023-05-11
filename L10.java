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
            public ListNode reverseList(ListNode head) {
                ListNode pre=null;
                ListNode cur=head;
                ListNode temp;
                while(cur!=null){
                    temp=cur.next;
                    cur.next=pre;
                    pre=cur;
                    cur=temp;
                }
                return pre;
            }
        }

/*
题目描述：给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。输入：head = [1,2,3,4,5]
输出：[5,4,3,2,1]

思路：双指针 先定义一个cur指针，在定义一个pre指针在cur指针之前，循环的结束条件就是当cur
等于null的情况，定义一个临时变量来存cur.next，不然指针就断了无法赋值了，将cur.next赋值
给temp，不然没法移动，然后此时就由cur指向了pre，然后cur的值赋给pre，将temp的值赋给cur，
最后返回反过来的头节点pre
*/
