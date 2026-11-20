// 1. Sum Nodes on Longest Path
// class Solution {
//     int maxSum = 0;
//     int maxLength = 0;

//     void solve(Node root, int length, int sum) {
//         if (root == null) {
//             return;
//         }

//         length++;
//         sum += root.data;

//         if (root.left == null && root.right == null) {

//             if (length > maxLength) {
//                 maxLength = length;
//                 maxSum = sum;
//             } 
//             else if (length == maxLength) {
//                 maxSum = Math.max(maxSum, sum);
//             }

//             return;
//         }

//         solve(root.left, length, sum);
//         solve(root.right, length, sum);
//     }

//     public int sumOfLongRootToLeafPath(Node root) {
//         maxLength = 0;
//         maxSum = 0;

//         solve(root, 0, 0);

//         return maxSum;
//     }
// }

// //2. Zig-Zag Tree Traversal
// class Solution {
//     ArrayList<Integer> zigZagTraversal(Node root) {
//         ArrayList<Integer> ans = new ArrayList<>();

//         if (root == null) return ans;

//         Queue<Node> q = new LinkedList<>();
//         q.add(root);

//         int level = 0;

//         while (!q.isEmpty()) {
//             int size = q.size();
//             ArrayList<Integer> currLevel = new ArrayList<>();

//             for (int i = 0; i < size; i++) {
//                 Node curr = q.poll();

//                 currLevel.add(curr.data);

//                 if (curr.left != null)
//                     q.add(curr.left);

//                 if (curr.right != null)
//                     q.add(curr.right);
//             }

//             if (level % 2 != 0) {
//                 Collections.reverse(currLevel);
//             }

//             ans.addAll(currLevel);
//             level++;
//         }

//         return ans;
//     }
// }




// //3.Iterative Preorder Traversal

// class Solution {
//     ArrayList<Integer> preOrder(Node root) {
//     ArrayList<Integer> ans = new ArrayList<>();
//     if(root ==null){
//         return ans;
//     }
    
//     Stack<Node>st = new Stack<>();
//     st.push(root);
    
//     while (!st.isEmpty()) {
//         Node curr = st.pop();
//         ans.add(curr.data);

//         if (curr.right != null) {
//             st.push(curr.right);
//         }

//         if (curr.left != null) {
//             st.push(curr.left);
//         }
//     }
//     return ans;
        
//     }
// }


// //4.   Iterative Inorder 
// class Solution {
//     ArrayList<Integer> inOrder(Node root) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         Stack<Node> st = new Stack<>();

//         Node curr = root;

//         while (curr != null || !st.isEmpty()) {

//             while (curr != null) {
//                 st.push(curr);
//                 curr = curr.left;
//             }

//             curr = st.pop();
//             ans.add(curr.data);

//             curr = curr.right;
//         }

//         return ans;
//     }
// }