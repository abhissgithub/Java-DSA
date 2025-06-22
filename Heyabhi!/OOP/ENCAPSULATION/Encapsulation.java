package OOP.ENCAPSULATION;
    public class Encapsulation {
        private int value;
        public void set(int x){
            value=x;
        }
        public int get(){
            return value;
        }
    }
    class B {
        public static void main(String[] args) {
            Encapsulation A=new Encapsulation();
            A.set(100);
            System.out.println(A.get());
        }
    }
