package OOP.INTERFACES;

interface A {
    public static void show(){
        System.out.println("Im in A");
    }
}
interface B {
    public static void show(){
        System.out.println("Im in B");
    }
}
class Interfacee implements A,B {
    public static void main(String[] args) {
    Interfacee A= new Interfacee();
    A.show();
}

    private void show() {

    }
}
