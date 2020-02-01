package rope;

public class MinimumInSortedArray {

    public int minInSortedArray(int[] array){
        int low = 0, high = array.length -1;
        while (high > low){
            int mid = (low + high)/2;
            if(array[mid] > array[high])
                low = mid+1;
            else
                high = mid;
        }
        return array[low];
    }

    public static void main(String[] args) {
        int[] array = {0,5,6,7,4,1,2};
        MinimumInSortedArray minimumInSortedArray = new MinimumInSortedArray();
        int num = minimumInSortedArray.minInSortedArray(array);
        System.out.println("Minimum number in the array is "+ num);
    }
}
