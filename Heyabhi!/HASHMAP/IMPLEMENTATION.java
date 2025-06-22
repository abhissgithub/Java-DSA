package HASHMAP;

// Creating MY HashMap

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.List;

public class IMPLEMENTATION {

    static class MYHashMap < K , V > {

        static final int capacity=4;

        static final float LoadBalancer=0.75f;

        public class Node{
            K key;
            V value;

            Node( K key, V value){
                this.key=key;
                this.value=value;

            }

        }
        public  int n; // Number of entries
        public LinkedList<Node>[] buckets;

        public void initbucket(int N){  // Capacity/Size of Bucket Array
            buckets=new LinkedList[N];
//            Now we traverse on bucket and keep empty LinkedList on each bucket
            for (int i=0;i< buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }
        public MYHashMap(){
            initbucket(capacity);
        }
        public int HashFunction(K key){
            int hc=key.hashCode();  //  this will give any value,and it may be +ve or -ve,so we use abs
            return Math.abs(hc)% buckets.length;
        }

        public int size() {  // Return Number of entries
            return n;

        }
//            For Put function first of all we have to search that if is value already available in bucket or not
//            so that's why we have to make Search Function
            private int Searchinbucket(LinkedList<Node>ll,K key) {
//            This will traverse ll and looks for a node with key, if found it will return its index otherwise it will return null
                for (int i=0;i<ll.size();i++){
                    if (ll.get(i).key==key){
                        return i;
                    }
                }
                return -1;

            }


        public void put(K key, V value) { // take care of insert & update of element

//            For Put function first of all we have to search that if is value already available in bucket or not
//            so that's why we have to make Search Function

            LinkedList<Node>curentbucket=new LinkedList<>();
            int ei=Searchinbucket(curentbucket,key);
            if (ei==-1){   // key doesn't exit
                Node node=new Node(key,value);  // here we make new node and
                curentbucket.add(node);  // insert it in currentbucket
                n++;
            }
            else {   // Update case
                Node curNode=curentbucket.get(ei);
                curNode.value=value;

            }

        }
        public V get(K key) {  // return the value

            int bi=HashFunction(key);
            LinkedList<Node>currentbucket=buckets[bi];
            int ei=Searchinbucket(currentbucket,key);
            if (ei!=-1){
                Node currnode=currentbucket.get(ei);
                return currnode.value;
            }
            return null;
        }


        public V remove(K key) { // return the val
            int bi=HashFunction(key);
            LinkedList<Node> currentbucket=buckets[bi];
            int ei=Searchinbucket(currentbucket,key);
            if (ei!=-1){
                Node currentnode=currentbucket.get(ei);
                V val=currentnode.value;
                currentbucket.remove(ei);
                n--;
                return val;

            }
            return null;

        }

    }

    public static void main(String[] args) {
        MYHashMap<String,Integer> mp = new MYHashMap<String, Integer>();
        System.out.println("Testinng put");
        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        System.out.println(mp.size());
        mp.put("c",40);
        mp.put("d",9);
        mp.put("f",13);
        mp.remove("c");
        System.out.println(mp.size());




    }

}
