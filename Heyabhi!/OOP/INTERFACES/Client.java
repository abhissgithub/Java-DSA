package OOP.INTERFACES;

interface Client {

     void input();
     public abstract void output();

}
interface Client2 {
    void result();

}
 class Developer implements Client,Client2 {
     @Override
     public void input() {
         System.out.println("Im input");
     }

     @Override
     public void output() {
         System.out.println("I m output");
     }

     @Override
     public void result() {
         System.out.println("Im result");
     }

     public static void main(String[] args) {
         Developer abhi = new Developer();
         abhi.result();
         abhi.input();
         abhi.output();
     }
 }
