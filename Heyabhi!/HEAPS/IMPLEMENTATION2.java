package HEAPS;

import java.util.ArrayList;

class HEAP < T extends Comparable<T>>{
    public ArrayList<T> list;

    public HEAP() {
        list=new ArrayList<>();
    }
    public int parent(int index){
        return (index-1)/2;
    }
    public int left(int index){
        return 2*index+1;
    }
    public int right(int index){
        return 2*index+2;
    }
    public void swap(int first,int second){
        T temp=list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);


    }
    public void insert(T value){
        list.add(value);
        Upheap(list.size()-1);
    }

    private void Upheap(int index) {
        if (index==0){
            return;     // Root node, no parent to compare with
        }
        int p=parent(index);    // Get the parent index

        // Compare the current node with its parent
        if (list.get(index).compareTo(list.get(p))<0){
            swap(index,p);   // Swap if the current node is smaller than its parent
            Upheap(p);      // Recursively call Upheap on the parent index
        }
    }
    public T delete() throws Exception{
        if (!list.isEmpty()){
            throw new Exception("Removing from empty list!");
        }
        T temp=list.get(0);
        T last=list.remove(list.size()-1);
        if (!list.isEmpty()){
            list.set(0,last);
            Downheap(0);
        }
        return temp;
    }

    private void Downheap(int index) {
        int min=index;          // Assume the current node is the minimum
        int left=left(index);   // Get the left child index
        int right=right(index); // Get the right child index

        // Check if the left child exists and is smaller than the current node
        if (left<list.size() && list.get(min).compareTo(list.get(left))>0){
            min=left;     // Update min to left child index
        }

        // Check if the right child exists and is smaller than the current node
        if (right<list.size() && list.get(min).compareTo(list.get(right))>0){
            min=right;    // Update min to right child index
        }

        // If the min index is not the current index, swap and recursively call Downheap
        if (min!=index){
            swap(min,index);
            Downheap(min);
        }
    }
    public  ArrayList<T> HeapSort() throws Exception{
        ArrayList<T> data=new ArrayList<>();
        if (!list.isEmpty()){
            data.add(this.delete());
        }
        return data;
    }


}

