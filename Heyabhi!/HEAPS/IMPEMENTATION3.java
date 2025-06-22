package HEAPS;

import java.util.ArrayList;

public class IMPEMENTATION3 <T extends Comparable<T>> {

    public ArrayList<T> list;

    public IMPEMENTATION3( ) {
        list=new ArrayList<>();
    }

    public void swap(int first,int second){
        T temp=list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }
    public void insert(T value){
        list.add(value);
        upheap(list.size()-1);
    }

    private void upheap(int index) {
        if (index==0){
            return;
        }
        int p=parent(index);
        if (list.get(index).compareTo(list.get(p))<0){
            swap(index,p);
            upheap(p);
        }
    }
    public T remove () throws Exception {
        if (list.isEmpty()){
            throw new Exception("You cant remove from empty list");
        }
        T temp=list.get(0);

        T last=list.remove(list.size()-1);
        list.set(0,last);
        downhwap(0);
        return temp;

    }

    private void downhwap(int index) {
        int min=index;
        int left=left(index);
        int right=right(index);
        if (left<list.size() && list.get(min).compareTo(list.get(left))>0){
            left=min;
        }
        if (right<list.size() && list.get(min).compareTo(list.get(right))>0){
            right=min;
        }
        if (min!=index){
            swap(min,index);
            downhwap(min);
        }
    }
    public ArrayList<T> heapsort() throws Exception{
        ArrayList<T> list=new ArrayList<>();
        if (!list.isEmpty()) {
            list.add(this.remove());
        }
        return list;
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

    public static void main(String[] args) {

    }

}
