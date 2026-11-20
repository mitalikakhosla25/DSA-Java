public class Leetcode_19 {
    public class ListNode {
int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        
}

    public ListNode removeNthFromEnd(ListNode head, int n) {
if(head ==null){
    return null;
}
int countt = length(head);
if( countt == n){
    return head.next;
}


        int node = countt - n-1;
          ListNode ans= head;
        while( node > 0){
            ans = ans.next;
            node--;
        }
        ans.next = ans.next.next;
        return head;

    }
private static int length(ListNode head){ 
            int count =1;
        ListNode temp = head;
        while ( temp.next != null){
            temp = temp.next;
            count++;
        }
        return count;
}
}

