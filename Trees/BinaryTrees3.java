// height of the tree : 
public class BinaryTrees3 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    } 

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree (int [] Nodes){
            idx++;
            if(idx>=Nodes.length || Nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(Nodes[idx]);
            newNode.left = buildTree(Nodes);
            newNode.right = buildTree(Nodes);

            return newNode;
        }
    }

    static int height_of_tree(Node root){
        if(root==null){
            return 0;
        }

        int leftHeight = height_of_tree(root.left);
        int rightHeight = height_of_tree(root.right);

        int maxHeight = Math.max(leftHeight, rightHeight) +1;
        
        return maxHeight;

    }
    public static void main(String[] args) {
        int Nodes [] = {5,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(Nodes);

        System.out.println(root);
        System.out.println(root.data);

        System.out.println(height_of_tree(root));

    }
}
