package LINKEDLIST;

public class MERGELINKEDLIST {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    ListNode Merge(ListNode list1, ListNode list2){
        ListNode node =new ListNode();
        ListNode ans=node;
        while(list1!=null && list2!=null){
            if (list1.val<list2.val) {
                list1.next = list1;
                ans.next = list1;
                ans=ans.next;
            }
            else list2.next=list2;
            ans.next=list2;
            ans=ans.next;
        }

            ans.next=(list1!=null) ? list1:list2;
        return node.next;
    }
  }

