package rope;

public class SearchInsertionPosition {


    public int searchInsert(int[] item, int key){
        int low = 0, high = item.length-1;
        while (high > low){
            int mid = (low + high)/2;
            if(item[mid] < key)
                low = mid+1;
            else
                high = mid;
        }

        return (item[low] < key) ? low+1 : low;
    }

    public static void main(String[] args) {

        int[] items = {1,3,5,6};
        SearchInsertionPosition searchInsertionPosition = new SearchInsertionPosition();
        int position = searchInsertionPosition.searchInsert(items,8);
        System.out.println("Item insertion position is " + position);

    }
}
