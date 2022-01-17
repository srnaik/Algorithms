package com.sac;

public class MergeSortImpl {

    int[] item = {2,3,6,18,10,7,0,12,9,8,-1};

    int[] inputArray;
    int[] tempArray;
    int length;

    void sortArray(int[] inputArray){
        this.inputArray = inputArray;
        this.length = inputArray.length;
        this.tempArray = new int[this.length];
        divideArray(0,this.length-1);

    }

    void divideArray(int lowIndex, int highIndex){
        if(lowIndex < highIndex){
            /*int middleIndex = (highIndex-lowIndex)/2 + lowIndex;*/
            int middleIndex = (highIndex+lowIndex) >>> 1;
            divideArray(lowIndex,middleIndex);
            divideArray(middleIndex+1, highIndex);
            mergeArray(lowIndex,middleIndex,highIndex);
        }
    }

    void mergeArray(int lowIndex, int midIndex, int highIndex){

        for(int i = lowIndex; i <= highIndex; i++){
            tempArray[i] = inputArray[i];
        }

        int i = lowIndex, k = lowIndex;
        int j = midIndex+1;

        while (i <= midIndex && j <= highIndex){
            if(tempArray[i] <= tempArray[j]){
                inputArray[k] = tempArray[i];
                i++;
            }else{
                inputArray[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= midIndex){
            inputArray[k] = tempArray[i];
            i++;
            k++;
        }

    }

    public static void main(String[] args) throws CloneNotSupportedException {
        MergeSortImpl mergeSort = new MergeSortImpl();
        int[] item = {2,3,6,18,10,7,0,12,9,8,-1};
        mergeSort.sortArray(item);
        System.out.println("Array Elements after sorting");
        for (int a : item) {
            System.out.print(a + " ");
        }

        //System.out.println("Divide: " + 27/7);
        //System.out.println("Percent: " + 22%7) ;

    }

}
