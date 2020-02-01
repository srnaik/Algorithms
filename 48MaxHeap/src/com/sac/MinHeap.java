package com.sac;

public class MinHeap {

    private int[] heapArray;
    private int size;

    public MinHeap(int size){
        heapArray = new int[size];
    }

    private boolean isLeaf(int pos){
        return (pos >= size/2 && pos <= size) ? true : false;
    }

    private int parent(int pos){
        return pos/2;
    }

    private int leftChild(int pos){
        return (2*pos);
    }

    private int rightChild(int pos){
        return (2*pos + 1);
    }

    private void swap(int posOne, int posTwo){
        int temp = heapArray[posOne];
        heapArray[posOne] = heapArray[posTwo];
        heapArray[posTwo] = temp;
    }

    private void minHeapify(int pos){

        if(isLeaf(pos))
            return;

        if(heapArray[pos] > heapArray[leftChild(pos)] || heapArray[pos] > heapArray[rightChild(pos)]){

            if(heapArray[leftChild(pos)] < heapArray[rightChild(pos)]){
                swap(pos,leftChild(pos));
                minHeapify(leftChild(pos));
            }else{
                swap(pos,rightChild(pos));
                minHeapify(rightChild(pos));
            }
        }
    }

    private void insert(int value){
        heapArray[size++] = value;
        int current = size;

        while (heapArray[current] < heapArray[parent(current)]){
            swap(current,parent(current));
            current = parent(current);
        }
    }

    private int extract(){
        int pop = heapArray[0];
        heapArray[0] = heapArray[size--];
        minHeapify(0);
        return pop;
    }

    public void print()
    {
        for (int i = 0; i <= size / 2; i++) {
            System.out.print(" PARENT : " + heapArray[i] + " LEFT CHILD : " +
                    heapArray[2 * i] + " RIGHT CHILD :" + heapArray[2 * i + 1]);
            System.out.println();
        }
    }

    public static void main(String[] arg)
    {
        System.out.println("The Max Heap is ");
        MinHeap minHeap = new MinHeap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);

        minHeap.print();
        System.out.println("The min val is " + minHeap.extract());
    }
}
