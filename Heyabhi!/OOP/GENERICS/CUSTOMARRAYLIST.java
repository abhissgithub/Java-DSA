package OOP.GENERICS;

import java.util.ArrayList;
import java.util.Arrays;

public class CUSTOMARRAYLIST <T> {
    private Object [] data;

    private static int DEAFAULT_SIZE=10;
    private int size=0;

    public CUSTOMARRAYLIST() {
        data=new Object[DEAFAULT_SIZE];
    }

    public void add(T num){
        if (isfull()){
            resize();
        }
        data[size++]=num;

    }
    public boolean isfull(){
        return size==data.length;
    }
    public void resize(){
        Object [] temp=new Object[data.length*2];
        for (int i=0;i<data.length;i++){
            temp[i]= data[i];
        }
        data=temp;
    }
    public T remove(){
        return (T) data[--size];
    }
    public T get(int index){
        return (T) data[index];
    }
    public void set (T value, int index){
        data[index]=value;
    }

    public int size(){
        return size;
    }


    @Override
    public String toString() {
        return "CUSTOMARRAYLIST{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CUSTOMARRAYLIST<Integer> list = new CUSTOMARRAYLIST<>();
        for (int i=0;i<50;i++){
            list.add(2*i);
        }
        System.out.println(list);
    }


}
