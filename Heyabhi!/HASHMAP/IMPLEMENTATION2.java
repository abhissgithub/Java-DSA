package HASHMAP;

import java.util.HashMap;
import java.util.LinkedList;

public class IMPLEMENTATION2 {
    public static class MyHashmap<K, V> {
        public static final int capacity = 4;
        public static final float LoadFactor = 0.75f;

        public class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        public int n;  // number of entries

        public int size() {

            return n;
        }

        LinkedList<Node>[] buckets;

        MyHashmap() {
            initbucket(capacity);
        }

        public void initbucket(int N) {   // Capacity of bucket
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

        }
        private int HashFunction(K key){
            int hc=key.hashCode();
            return Math.abs(hc)% buckets.length;

        }
        public int searchinbucket(LinkedList<Node>ll,K key){
            for (int i=0;i<ll.size();i++){
                if (ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
//        Put
        public void put(K key, V value){
            int bi= HashFunction(key);
            LinkedList<Node>currentbucket=buckets[bi];
            int ei=searchinbucket(currentbucket,key);
            if (ei==-1){  // key does not exist
                Node node=new Node(key,value);
                currentbucket.add(node);
                n++;
            }
            else{  // update case
                Node curnode=currentbucket.get(ei);
                curnode.value=value;

            }
        }
        public V get(K key){
            int bi=HashFunction(key);
            LinkedList<Node>currentbucket=buckets[bi];
            int ei=searchinbucket(currentbucket,key);
            if (ei!=-1){ // key exist
               Node currentnode=currentbucket.get(ei);
               return currentnode.value;

            }
            return null;
        }
        public V remove(K key){
            int bi=HashFunction(key);
            LinkedList<Node>currentbucket=buckets[bi];
            int ei=searchinbucket(currentbucket,key);
            if (ei!=-1){ // if exist
                Node currentnode=currentbucket.get(ei);
                V val=currentnode.value;
                currentbucket.remove(ei);
                n--;
                return val;

            }
            return null;
        }

        public static void main(String[] args) {
            MyHashmap <String,Integer> mp=new MyHashmap<>();
            mp.put("a",1);
            mp.put("b",2);
            System.out.println(mp.size());
            mp.put("a",5);
            System.out.println(mp.size());
            mp.remove("a");
            System.out.println(mp.size());
        }
    }
}
