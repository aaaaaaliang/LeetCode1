public class Solutin {
    public static void main(String[] args) {
        public ListNode getIntersectionNode (ListNode headA, ListNode headB){
            if (headA == null||headB ==null) {
                return null;
            }
            ListNode a = headA;
            ListNode b = headB;
            while (a != b) {
                if (a != null) {
                    a = a.next;
                } else {
                    a = headB;
                }
                if (b != null) {
                    b = b.next;
                } else {
                    b = headA;
                }
            }
            return a;
        }
    }
}

/*
题目描述：给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
图示两个链表在节点 c1 开始相交：
题目数据 保证 整个链式结构中不存在环。
注意，函数返回结果后，链表必须 保持其原始结构。

思路：双指针 定义a指针指向headA，定义b指针指向headB，a和b往前走，如果哪个走到头就会开始走对方走的路，会有a等于b
*/
