public class BinaryTrees2 {

    static class Node{
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
        public static Node buildTree(int Nodes[]){
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

    public static int sum_of_Nodes(Node root){
        if(root==null){
            return 0;
        }

        int leftNodes = sum_of_Nodes(root.left);
        int rightNodes = sum_of_Nodes(root.right);

        return leftNodes + rightNodes + root.data;
    }

    public static void main(String[] args) {
        int Nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        
        Node root = tree.buildTree(Nodes);
        System.out.println(root.data);

        System.out.println(sum_of_Nodes(root));
    }
    
}
