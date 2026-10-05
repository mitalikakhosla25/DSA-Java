public class ImpUsinArray {
    static class Queue{
        int[] arr;
        int front;
        int size;
        int rear;

        Queue(int size){
            this.size = size;
            arr = new int[size];
            front = -1;
            rear = -1;
        }
    
    void enqueue(int value){
        if(rear == size -1){
System.out.println("Queue Overflow");
return;
        }
        if(front == -1){
            front =0;
        }
        rear++;
        arr[rear]= value;
        System.out.println(value+" INSERTED");
    }
    void dequeuer(){
        if(front == -1 || front > rear){
            System.out.println("QUEUE UNDERFLOW");
        return;}
            System.out.println(arr[front] + "REMOVED");
            front++;
    }
    void peek(){
                if(front == -1 || front > rear){
            System.out.println("QUEUE EMPTY");
        return;}
        System.out.println(arr[front] +" : is front element");
    }
    void displayall(){
        if(front == -1 || front > rear){
        System.out.println("QUEUE EMPTY");
        return;}

        for(int i=front;i<= rear;i++){
System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    }

    public static void main(String[] args) {
           Queue q = new Queue(5);
           
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    q.displayall(); 
    

 // LC 933, 1700

}


}