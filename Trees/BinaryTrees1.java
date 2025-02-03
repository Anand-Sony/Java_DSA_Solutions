public class BinaryTrees1 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int Nodes []){
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

    public static int Count_of_nodes(Node root){
        if(root==null){
            return 0;
        }

        int leftNodes = Count_of_nodes(root.left);
        int rightNodes = Count_of_nodes(root.right);
        
        return leftNodes + rightNodes + 1;
    }


    public static void main(String[] args) {

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(Count_of_nodes(root));
        
    }
}
