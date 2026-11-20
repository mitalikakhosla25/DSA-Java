import java.util.*;
public class Traversing_3 {
    public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    // ADD 70 
    st.push(40);
    st.push(50);

//     System.out.println(st.size());
//     System.out.println("FOLLOWING ARE ELEMENTS IN STACK : ");
//     // USING ANOTHER STACK : 
Stack<Integer> st2 = new Stack<>();
//     int[] arr = new int[st.size()];
//         int j=0;
//     while(st.size() != 0){
//         int x = st.pop();
//         System.out.println(x+" ");
//         arr[j] = x;
//         st2.push(x);
//         j++;
//     }
//     while(st2.size() !=0){
//     st.push(st2.pop());
//     }
//     // USING ARRAY : 
// for(int i=0;i<st.size();i++){
//     System.out.print(arr[i]+" ");
// }

//PEEK, ADD, REMOVE AT ANY POSITION 
int index = 2;
while( st.size() >index+1 ){
    st2.push(st.pop());
}
System.out.println(st.peek());   // peek 
st.push(70);                     // Adding element 
while(st2.size() > 0){
    st.push(st2.pop());
}
    int[] arr = new int[st.size()];
        int j=0;
    while(st.size() != 0){
        int x = st.pop();
        arr[j] = x;
        j++;
    }
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}








    }
}
