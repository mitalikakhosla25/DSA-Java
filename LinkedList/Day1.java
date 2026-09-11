// 1. BUILD A LINKED LIST 
// 2. TRAVERSE A LINEKD LIST
// 3. COUNT NODES IN LINKED LIST
// 4. FIND SMALLEST 
// 5. FIND LARGEST 
// 6. SUM OF ALL NODES
// 7. SEARCH FOR GIVEN NODE
// 8. POSITION OF A GIVEN VALUE

class Day1  {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void traverse(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
    public static int countNodes(Node head){
            Node temp = head;
            int count=0;
            while(temp != null){
                count++;
                temp=temp.next;
            }
                return count;
    }

    public static int smallest(Node head){
        Node temp = head.next;
        int small = head.data;

        while(temp != null){

            if( temp.data < small){
                small =temp.data;
            }
            temp = temp.next;
        }
        return small;
    }

    public static int largest(Node head){
        Node temp = head.next;
        int larger = head.data;
while(temp != null){
    if(temp.data > larger){
        larger = temp.data;
    }
    temp = temp.next;
}
        return larger;
    }
    public static int summ(Node head){
        int sum=0;
        Node temp = head;
        while( temp != null){
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }

    public static void search(Node head, int n){
        Node temp=head;
        while(temp != null){
            if( temp.data == n){
                System.out.print("Found");
                return;
            }
            temp = temp.next;
        }
        System.out.print("Not Found");

    }

public static int posOfValue(Node head, int value){
        Node temp = head;
        int pos = 1;
        while(temp != null){
            if (temp.data == value) {
                return pos;
            }
            temp = temp.next;
            pos++;
        }
    return -1;
}
    public static void main(String[] args) {

        Node h1 = new Node(9);
        Node h2 = new Node(20);
        Node h3 = new Node(30);
        Node h4 = new Node(40);
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        traverse(h1);
        System.out.println();

        int totalcount = countNodes(h1); 
        System.out.println("TOTAL NUMBER OF NODES : "+totalcount);

        int smallestNumber = smallest(h1);
        System.out.println("SMALLEST NUMBER IIN LL IS : "+smallestNumber);

        int largesttNumber = largest(h1);
        System.out.println("LARGEST NUMBER IN LL IS : "+largesttNumber);

        System.out.println("SUM OF GIVEN LL IS :"+summ(h1));
        // String s1 =search(h1,70);
        // String s2 =search(h1,30)
        System.err.print("NODE TO BE SEARCH IS  : ");
        search(h1,30);
        System.out.println();
        System.err.print("NODE TO BE SEARCH IS  : ");
        search(h1,0);
        System.out.println();
        System.out.println("POSITION OF DESIRED VALUE IS :"+ posOfValue(h1,30));
    }
}