// DAY 1 : 
// STACK IMPLEMENTATION USING ARRAY 
// STACK IMPLEMENTATION USING LINKED LIST : UsingLL.java
// LC : 155 , 739 
class UsingArray{

    static class Stack{
        int[] arr;
        int top;
        Stack(int size){
            arr = new int[size];
            top = -1;

        }

        void push(int value){
            if(top == arr.length-1){
                System.out.println("STACK IS ALREADY FULL - STACK OVERFLOW");
                return;
            }
            arr[++top] = value;

        }
        int pop(){
            if(top == -1){
                System.out.println("STACK UNDERFLOW");
                return -1;
            }
            return arr[top--] ;
        }

        int peek(){
            if(top == -1){
                return -1;
            }
            return arr[top];

        }
        void display(){
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }
    }






    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        System.out.println("Popped : "+ st.pop());
        System.err.println("THE TOP ELEMENT IS : "+ st.peek());
        st.display();



    }
}