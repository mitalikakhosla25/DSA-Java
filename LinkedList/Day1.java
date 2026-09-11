// BUILD A LINKED LIST 
// TRAVERSE A LINEKD LIST
// COUNT NODES IN LINKED LIST
// FIND SMALLEST 
// FIND LARGEST 
// SHIFT SMALLEST AND LARGEST TO FIRST AND LAST.
// COPY A LINKED LIST


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

        
    }
}