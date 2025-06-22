package LINKEDLIST;

public class CYCLEDETECTION {
//    CYCLE DETECTION AND LENGTH OF CYCLE
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
      }
}
    static boolean cycle(ListNode head){

        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                return true;
            }


        }
        return false;
    }

    public static void main(String[] args) {
    }
}
