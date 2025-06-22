package HASHMAP;

import java.security.Key;
import java.util.LinkedList;

public class REHASHING {
    class MyHashMap<K,V>{

        static final int capacity=4;
        static final float laodFactor=0.75f;

        public MyHashMap() {
            initbucket(capacity);
        }
        LinkedList <Node> [] bucket;
        int n;

        private void initbucket(int N) {
            bucket=new LinkedList[N];
            for (int i=0;i<bucket.length;i++){
                bucket[i]=new LinkedList<>();
            }

        }
        public int size(){
            return n;
        }

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        public int SearchinLinkedList(LinkedList<Node>ll,K key){
            for (int i=0;i<ll.size();i++){
                if (ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        public int HashFunction(K key){
            int hc=key.hashCode();
            return Math.abs(hc)%bucket.length;
        }
        public void put(K key,V value){  // insert / update
            int bi=HashFunction(key);
            LinkedList<Node> currentbucket=bucket[bi];
            int ei=SearchinLinkedList(currentbucket,key);
            if (ei==-1){
//
                Node node =new Node(key,value);
                currentbucket.add(node);
            }
            else{
                Node node=currentbucket.get(ei);
                node.value=value;

            }
//            Rehashing
            if (n>= currentbucket.size()*laodFactor);
            rehash();


        }

        private void rehash() {
            LinkedList<Node> [] oldbucket=bucket;
            initbucket(bucket.length*2);
            for (var bucket:oldbucket){
                for (var node:bucket){
                    put(node.key,node.value);

                }
            }
        }

    }



}
