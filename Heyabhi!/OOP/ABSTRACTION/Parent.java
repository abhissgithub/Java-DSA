package OOP.ABSTRACTION;

public abstract class Parent {
    public Parent(int age) {
        this.age = age;
    }

    int age;
//     We cant create Abstract constructor
//    abstract void Parent;

    static void hello(){
        System.out.println("hello i am static method");
    }
    void hey(){
        System.out.println("Hey i am normal method");
    }
    public abstract void career();
    public abstract void partner();
}
