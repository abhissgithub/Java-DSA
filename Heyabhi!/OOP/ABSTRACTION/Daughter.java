package OOP.ABSTRACTION;

public class  Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    public void career() {
        System.out.println("I'll be a engineer");
    }

    @Override
    public void partner() {
        System.out.println("I love abhi");

    }
}
