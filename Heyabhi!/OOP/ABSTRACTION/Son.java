package OOP.ABSTRACTION;

public  class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    public void career(){
        System.out.println("I'll be a engineer");
    }
    @Override
    public void partner(){
        System.out.println("I love sanu!");
    }
}
