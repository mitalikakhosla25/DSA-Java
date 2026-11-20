import java.util.PriorityQueue;
public class Leetcode_23 {
      public class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

   
    public ListNode mergeKLists(ListNode[] lists) {
        // APPROACH : A 
        PriorityQueue <Integer> pq = new PriorityQueue<>();

        for(ListNode list : lists){
            while(list != null){
                pq.add(list.val);
                list = list.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(!pq.isEmpty()){
            curr.next = new ListNode(pq.poll());
            curr = curr.next;
        }
        return dummy.next;
    }
}

