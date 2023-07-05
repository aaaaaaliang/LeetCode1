将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
示例 1：


输入：l1 = [1,2,4], l2 = [1,3,4]
输出：[1,1,2,3,4,4]
示例 2：

输入：l1 = [], l2 = []
输出：[]
示例 3：

输入：l1 = [], l2 = [0]
输出：[0]

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/merge-two-sorted-lists
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

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
     ListNode dummy=new ListNode(0);
     ListNode current=dummy;

     while(list1!=null&&list2!=null){
         if(list1.val<list2.val){
             current.next=list1;
            list1=list1.next;
         }else{        
             current.next=list2;
             list2=list2.next;
         }
         current=current.next;
     }
     if(list1!=null){
         current.next=list1;
     }
     if(list2!=null){
         current.next=list2;
     }
     return dummy.next;
    }
}

思路：定义新的链表头部为dummy,并用指针指向头部，依次遍历两个链表，判断，将其加入新的链表里，最后判断是否有剩余
