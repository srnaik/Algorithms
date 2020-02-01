package rope;

public class BinarySearchMain {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.insert(50);
        binarySearch.insert(30);
        binarySearch.insert(20);
        binarySearch.insert(40);
        binarySearch.insert(70);
        binarySearch.insert(60);
        binarySearch.insert(80);

        System.out.println("Inorder Traversal");
        binarySearch.display();
        System.out.println("Delete 20 \n");
        binarySearch.delete(70);
        binarySearch.display();

        int item = 70;
        Node node = binarySearch.search(item);
        if(node != null && node.key == item)
            System.out.println("Element found in BST");
        else
            System.out.println("Element not found in BST");

    }
}
