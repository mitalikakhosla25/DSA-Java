// Write and run Java online using this editor.
import java.util.*;
class ReverseString {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(90);
        String s = "Hello";
        Deque <Character> dqq = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            dqq.addFirst(s.charAt(i));
        }
        StringBuilder res=new StringBuilder();
        while( !dqq.isEmpty()){
        res.append(dqq.removeFirst());
        }

        System.out.println(s);
        System.out.print(res);


        // palindrome checker 
                        String st = "madam";
        boolean check = true;
        Deque <Character> dqqq = new ArrayDeque<>();
        for(int i=0;i<st.length();i++){
            dqqq.addFirst(s.charAt(i));
        }
       while( dqqq.size() > 1){
           char first = dqqq.removeFirst();
           char last = dqqq.removeLast();
           if(first != last){
               check = false;
               break;
           }
       }
        if(check){
            System.out.print("Palindrome");
        }
        else{System.out.print("Not palindrome");}
        }



// class Main {

//     static class CircularQueue {
//         int[] arr;
//         int front, rear, size, capacity;

//         CircularQueue(int capacity) {
//             this.capacity = capacity;
//             arr = new int[capacity];
//             front = 0;
//             rear = -1;
//             size = 0;
//         }

//         // Insert element
//         void enqueue(int value) {
//             if (size == capacity) {
//                 System.out.println("Queue is full");
//                 return;
//             }

//             rear = (rear + 1) % capacity;
//             arr[rear] = value;
//             size++;

//             System.out.println("Inserted: " + value);
//         }

//         // Remove element
//         void dequeue() {
//             if (size == 0) {
//                 System.out.println("Queue is empty");
//                 return;
//             }

//             System.out.println("Removed: " + arr[front]);

//             front = (front + 1) % capacity;
//             size--;
//         }

//         // Display queue
//         void display() {
//             if (size == 0) {
//                 System.out.println("Queue is empty");
//                 return;
//             }

//             System.out.print("Queue: ");

//             for (int i = 0; i < size; i++) {
//                 int index = (front + i) % capacity;
//                 System.out.print(arr[index] + " ");
//             }

//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         CircularQueue q = new CircularQueue(5);

//         q.enqueue(10);
//         q.enqueue(20);
//         q.enqueue(30);
//         q.enqueue(40);

//         q.display();

//         q.dequeue();
//         q.dequeue();

//         q.display();

//         q.enqueue(50);
//         q.enqueue(60);
//         q.enqueue(70);

//         q.display();
//     }
// }

    }
//}


// import java.util.*;

// class Patient {
//     String name;
//     String disease;
//     int priority;

//     Patient(String name, String disease, int priority) {
//         this.name = name;
//         this.disease = disease;
//         this.priority = priority;
//     }
// }

// class Hospital {
//     PriorityQueue<Patient> queue = new PriorityQueue<>(
//         (p1, p2) -> p1.priority - p2.priority
//     );

//     void addPatient(String name, String disease, int priority) {
//         Patient p = new Patient(name, disease, priority);
//         queue.add(p);

//         System.out.println(name + " added to queue.");
//     }

//     void treatPatient() {
//         if (queue.isEmpty()) {
//             System.out.println("No patients waiting.");
//             return;
//         }

//         Patient p = queue.poll();

//         System.out.println("Treating patient: " + p.name);
//         System.out.println("Disease: " + p.disease);
//     }

//     void displayQueue() {
//         if (queue.isEmpty()) {
//             System.out.println("Queue is empty.");
//             return;
//         }

//         PriorityQueue<Patient> temp = new PriorityQueue<>(queue);

//         while (!temp.isEmpty()) {
//             Patient p = temp.poll();
//             System.out.println(
//                 p.name + " - " + p.disease
//                 + " - Priority: " + p.priority
//             );
//         }
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Hospital h = new Hospital();

//         h.addPatient("Rahul", "Fever", 3);
//         h.addPatient("Aman", "Heart problem", 1);
//         h.addPatient("Priya", "Fracture", 2);

//         System.out.println("\nPatients in priority order:");
//         h.displayQueue();

//         System.out.println("\nNext patient:");
//         h.treatPatient();
//     }
// }
