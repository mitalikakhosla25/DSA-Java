import java.util.*;
public class ReverseSt_4 {
    public static void main(String[] args) {
        
        // REVERSE STACK 
        Stack<Integer> st = new Stack<>();
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);

        int[] arr = new int[st.size()];
        int x = 0;
    while(st.size() > 0){
        arr[x] = st.pop();
        x++;
    }

    for(int i =0;i< arr.length;i++){
        st.push(arr[i]);
    }
    while(st.size() >0){
        System.out.println(st.pop());
    }







    }
}
