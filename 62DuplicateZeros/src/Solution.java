public class Solution {

    public void duplicateZeros(int[] arr) {

        int[] tempArray = new int[arr.length];
        int j = 0, i =0;

        while (j < tempArray.length) {
            tempArray[j] = arr[i];

            if(arr[i] == 0 && j < tempArray.length-1){
                tempArray[++j] = 0;
            }

            i++;
            j++;

        }

        for (int m = 0, k =0; m < tempArray.length; m++,k++) {
            arr[m] = tempArray[k];
        }

       for(int z = 0; z < arr.length; z++){
           System.out.print(arr[z]  + "\t");
       }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,0,2,3,0,4,5,0};

        solution.duplicateZeros(arr);
    }
}
