public class BinaryTrees4 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    } 

    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int [] Nodes){
            idx++;
            if(idx>=Nodes.length  || Nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(Nodes[idx]);
            newNode.left = buildTree(Nodes);
            newNode.right = buildTree(Nodes);

            return newNode;
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight)+1;

        return myHeight;
    } 

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);

        int diameter3 = height(root.left) + height(root.right)+1;
        
        return Math.max(diameter3 , Math.max(diameter1, diameter2));
    }



    static class TreeInfo{
        int height;
        int diameter;

        public TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left  = diameter2(root.left);
        TreeInfo right  = diameter2(root.right);
        int myheight = Math.max(left.height, right.height) + 1;

        int dia1 = left.diameter;
        int dia2 = right.diameter;
        int dia3 = left.height + right.height + 1;

        int myDiameter = Math.max(dia3, Math.max(dia1, dia2));

        TreeInfo myinfo = new TreeInfo(myheight, myDiameter);
        return myinfo;

    }
    public static void main(String[] args) {
        int Nodes [] = {11,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(Nodes);
        System.out.println("Root of the tree is "+root.data);

        System.out.println("Height of the tree is "+height(root));
        System.out.println("Diameter of the tree is "+diameter(root));
        System.out.println("Diameter of the tree is "+diameter2(root).diameter);

    }
}