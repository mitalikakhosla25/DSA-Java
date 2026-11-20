import java.util.*;

public class Implentation{

    static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data+" ");
            if(curr.left != null){
                q.add(curr.left);
            }
         if(curr.right != null){
                q.add(curr.right);
            }
        }
    }


    static int CountNode(Node root){
        if(root == null){
            return 0;
        }
        return 1+CountNode(root.left)+CountNode(root.right);
    }

    static int height(Node root){
        if(root == null){
            return -1;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return 1 + Math.max(leftheight,rightheight);
    }

    static void preOrder(Node root){
        if(root == null){
            return ;
        }
System.out.print(root.data+" ");
preOrder(root.left);
preOrder(root.right);
    }

static void inOrder(Node root){
    if(root == null){
        return;
    }
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
}

static void postOrder(Node root){
    if(root == null){
        return;
    }
    postOrder(root.right);
    System.out.print(root.data+" ");
    postOrder(root.left);
}






public static void main(String[] args){
    Node root = new Node(10);
    root.left = new Node(20);
    root.right=new Node(30);
    root.left.left = new Node(40);
    root.left.right=new Node(50);
    root.right.left = new Node(60);
    root.right.right = new Node(70);
//System.out.print(root.left.left);
//levelOrder(root);
//System.out.print(CountNode(root));
//System.out.print(height(root));
preOrder(root);

inOrder(root);
postOrder(root);

}
//  CHECK IF BINARY TREE IS COMEPLETE OR NOT ? 
static class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        }
    }    
}