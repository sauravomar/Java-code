package HackerEarth.heap;

/**
 * Created by saurav on 18/4/15.
 */
public class Heap {

    int array [];

    public int getParent(int child){
        if(child ==0 || child < 0 || child >= array.length) return -1;
        return (child -1)/2;
    }

    public int getLeftChild(int parent){
        if(2 * parent > array.length) return -1;
        return 2*parent +1;
    }

    public int getRightChild(int parent){
        if(2 * parent > array.length) return -1;
        return 2*parent +2;
    }

    public void heapify(int idx){

        int length = array.length;
        int largest = idx;
        int left = (idx << 1) + 1;
        int right = (idx + 1) << 1;

        if (left < length && array[left] > array[largest]) largest = left;
        if (right < length && array[right] >array[largest]) largest = right;

        if (largest != idx)
        {
            swap(largest,idx);
            heapify(largest);
        }

    }

   public void swap(int a, int b) {
       int t = array[a];
       array[a] = array[b];
       array[b] = t;
   }

    public void shift(){
        int length = array.length;
        for(int i = 1;i<length;i++){
            array[i-1] = array[i];
        }
    }
    public void buildHeap(){
        int length = array.length;

        for(int i=length/2;i>=0;i--){
            heapify(i);
        }
    }

    public static void main(String args[]){
        Heap obj = new Heap();
        obj.array = new int []{1,4,9,6,8,17,14,20};
        obj.buildHeap();

    }
}
