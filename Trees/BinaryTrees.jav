import java.util.*;

public class BinaryTrees {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;

            if (idx>= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            // buildTree(nodes);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.println(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.data+ " ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }

    public static void levelOrder(Node root){
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currentNode  = q.remove();
            if(currentNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.println(currentNode.data + " ");
                if(currentNode.left != null){
                    q.add(currentNode.left);
                }
                if(currentNode.right != null){
                    q.add(currentNode.right);
                }
                
            }
        }
    }

    public static void main(String[] args) {
        int Nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(Nodes);

        // System.out.println(root.data);
        // preorder(root);  // root in start
        // inorder(root);      // root in the middle
        // postorder(root);  // root in the end
        
        levelOrder(root);
    }

}
