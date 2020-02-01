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

       ValidateBinarySearch validateBinarySearch = new ValidateBinarySearch();
        System.out.println(validateBinarySearch.isBinaryTree(binarySearch.getRoot()));

    }
}
