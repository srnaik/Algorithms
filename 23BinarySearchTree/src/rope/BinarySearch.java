package rope;

public class BinarySearch {

    private Node root;

    public BinarySearch(){
        root = null;
    }

    public void insert(int key){
        root = insert(root,key);
    }

    private Node insert(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.key)
            root.leftNode = insert(root.leftNode,key);
        else if(key > root.key)
            root.rightNode = insert(root.rightNode,key);
        return root;
    }

    public void display(){
        display(root);
    }

    private void display(Node root){
        if (root == null)
            return;
        if (root != null){
            display(root.leftNode);
            System.out.println(root.key);
            display(root.rightNode);
        }
    }

    public Node search(int key){
        return search(root,key);
    }

    private Node search(Node root, int key){
        if(root == null || root.key == key)
            return root;
        if(key < root.key)
            return search(root.leftNode,key);
        else
            return search(root.rightNode,key);
    }

    public void delete(int key){
        root = delete(root,key);
    }

    private Node delete(Node root, int key){

        if(root == null)
            return root;
        if(key < root.key)
            //if key is less than root value, traverse towards left side of the tree.
            root.leftNode = delete(root.leftNode,key);
        else if (key > root.key)
            //If key is greater than root value, traverse towards right side of the tree.
            root.rightNode = delete(root.rightNode,key);
        else{
            //Node to be deleted is found.
            if(root.rightNode == null)
                return root.leftNode;
            else if(root.leftNode == null)
                return root.rightNode;
            //If the node has both left and right children, find the min of right child.
            root.key = minValue(root.rightNode);
            //Delete the min of right child
            root.rightNode = delete(root.rightNode,root.key);
        }

        Math.abs(2-1);

        return root;
    }


    public int minValue(Node root){
        int minValue = root.key;
        while (root.leftNode != null){
            minValue = root.leftNode.key;
            root = root.leftNode;
        }
        return minValue;
    }
}
