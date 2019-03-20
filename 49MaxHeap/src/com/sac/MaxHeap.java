package com.sac;

public class MaxHeap {

    private int[] heapArray;
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        heapArray = new int[this.maxSize+1];
        heapArray[0] = Integer.MAX_VALUE;
    }

    private int parent(int pos){
        return pos/2;
    }

    private int leftChild(int pos){
        return (2 * pos);
    }

    private int rightChild(int pos){
        return (2*pos)+1;
    }

    private boolean isLeaf(int pos){
        return (pos >= (size/2) && pos <= size) ? true : false;
    }

    private void swap(int posOne, int posTwo){
        int temp;
        temp = heapArray[posOne];
        heapArray[posOne] = heapArray[posTwo];
        heapArray[posTwo] = temp;
    }

    private void maxHeapify(int position){

        if(isLeaf(position))
            return;

        if(heapArray[position] < heapArray[leftChild(position)] ||
                heapArray[position] < heapArray[rightChild(position)]){

            if(heapArray[leftChild(position)] > heapArray[rightChild(position)]){
                swap(position,leftChild(position));
                maxHeapify(leftChild(position));
            }else{
                swap(position,rightChild(position));
                maxHeapify(rightChild(position));
            }
        }
    }

    public void insert(int item) {
        heapArray[++size] = item;

        int current = size;

        while (heapArray[current] > heapArray[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + heapArray[i] + " LEFT CHILD : " +
                    heapArray[2 * i] + " RIGHT CHILD :" + heapArray[2 * i + 1]);
            System.out.println();
        }
    }

    // Remove an element from max heap
    public int extractMax()
    {
        int popped = heapArray[1];
        heapArray[1] = heapArray[size--];
        maxHeapify(1);
        return popped;
    }

    public static void main(String[] arg)
    {
        System.out.println("The Max Heap is ");
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        maxHeap.print();
        System.out.println("The max val is " + maxHeap.extractMax());
    }
}
