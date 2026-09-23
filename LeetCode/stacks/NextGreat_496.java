package LeetCode.stacks;

import java.util.HashMap;
import java.util.Stack;

public class NextGreat_496 {
    
    //public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        // BRUTE FORCE : 
    //    int n= arr1.length;
    //     int[] arr3 = new int[n];
    
    //     for (int i=0;i<arr1.length;i++){
    //         int x = arr1[i];
    //         int foundind = -1;

    //         for(int j=0;j<arr2.length;j++){
    //             if(arr2[j] == x){
    //                  foundind = j;
    //                  break;
    //             }
    //         }
    //         arr3[i] = -1;
                 
    //              for(int k = foundind +1 ;k<arr2.length;k++){
    //                 if(arr2[k] > x ){
    //                     arr3[i] = arr2[k];
    //                     break;
    //                 }
    //              }
    //         }
    //         return arr3;
     //   }





     // using stack optimal approach 
public int[] nextGreaterElement(int[] arr1, int[] arr2) {    
HashMap<Integer,Integer> map = new HashMap<>();
Stack<Integer> st = new Stack<>();

for (int i = arr2.length - 1;i>= 0;i--){
    int current = arr2[i];

    while(!st.isEmpty() && st.peek() <= current){
        st.pop();
    }
    if(st.isEmpty()){
        map.put(current, -1);
    }else{
        map.put(current,st.peek());
    }
    st.push(current);
}
int[] ans = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            ans[i] = map.get(arr1[i]);
        }

        return ans;
    }
}
  

