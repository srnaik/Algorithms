package rope;

public class BinarySearch {

    public int binarySearch(int[] arrayItems, int key){
        int low = 0, high = arrayItems.length -1;
        while (high >= low){
            int mid = (low + high)/2;
            if(arrayItems[mid] == key)
                return mid;
            if(arrayItems[mid] < key)
                low = mid + 1;
            else
                high = mid -1;
        }
        return -1;
    }

    public int binarySearchRecursive(int[] arrayItems, int key, int low, int high){
        if(arrayItems != null && arrayItems.length >= 1 && high >= low) {
            int mid = (low + high) / 2;
            if (arrayItems[mid] == key)
                return mid;
            if (arrayItems[mid] < key)
                return binarySearchRecursive(arrayItems, key, mid + 1, high);
            else
                return binarySearchRecursive(arrayItems, key, low, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrayItems = {10,20,30,32,40};
        BinarySearch binarySearch = new BinarySearch();
        /*int index = binarySearch.binarySearchRecursive(arrayItems,9871,0,arrayItems.length-1);*/
        int index = binarySearch.binarySearch(arrayItems,20);
        if(index > -1)
            System.out.println("Element found at index "+ index);
        else
            System.out.println("Element not found");
    }
}
