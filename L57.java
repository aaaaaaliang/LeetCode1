定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。

示例:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL


来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode current = head;
        Stack<ListNode> stack = new Stack<>();
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        ListNode tail = null;
        while (!stack.isEmpty()) {
            int value = stack.pop().val;
            ListNode newNode = new ListNode(value);
            if (newHead == null) {
                newHead = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return newHead;
    }
}

思路：遍历，定义一个栈，进栈，然后弹出 ，连接成链表
