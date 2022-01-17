package algorithms;

public class MaxHeap {

    private int[] heapArray;
    private int size;

    public MaxHeap(int size){
        heapArray = new int[size];
        heapArray[0] = Integer.MAX_VALUE;
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

    private void maxHeapify(int pos){

        if(isLeaf(pos))
            return;

        if(heapArray[pos] < heapArray[leftChild(pos)] || heapArray[pos] < heapArray[rightChild(pos)]){

            if(heapArray[leftChild(pos)] > heapArray[rightChild(pos)]){
                swap(pos,leftChild(pos));
                maxHeapify(leftChild(pos));
            }else{
                swap(pos,rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

    private void insert(int value){
        heapArray[++size] = value;
        int current = size;

        while (heapArray[current] > heapArray[parent(current)]){
            swap(current,parent(current));
            current = parent(current);
        }
    }

    private int extract(){
        int pop = heapArray[1];
        heapArray[1] = heapArray[size--];
        maxHeapify(1);
        return pop;
    }

    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + heapArray[i] + " LEFT CHILD : " +
                    heapArray[2 * i] + " RIGHT CHILD :" + heapArray[2 * i + 1]);
            System.out.println();
        }
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
        System.out.println("The max val is " + maxHeap.extract());
    }

}
