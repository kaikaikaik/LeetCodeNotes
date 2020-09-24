package Algorithm.DoublePointer;
/*
* 判断链表中是否存在环的方法：
* 定义两个指针，一个一次移动一个节点，另一个一次移动两个节点，如果链表中存在环，两个指针必定会相遇。
* */
public class linkedListCycle {
    public static void main(String[] args) {

    }
}
class ListNode {
  int val;
  ListNode next;
  ListNode(int x) {
      val = x;
      next = null;
  }
}

class Solution {
    public  boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode l1 = head;
        ListNode l2 = head.next;
        while (l1 != null && l2 != null && l2.next != null){
            if (l1 == l2){
                return true;
            }
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return false;
    }
}