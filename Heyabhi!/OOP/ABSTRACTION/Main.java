package OOP.ABSTRACTION;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(30);
        son.career();
        son.partner();
        Daughter dou=new Daughter(28);
        dou.career();
        dou.partner();

//        Parent par=new Parent() {
//        We can't Create object of Abstract class
//        If we want to create object then we also have to add method i.e. overridden method
//        If We Want to create object of Parent Class but there is no Body in Abstract Method
//        So How we will call the method

//        Even if we cant create object of abstract class we can use it as reference variable

        Parent daughter= new Daughter(25);
        daughter.career();

//        Constructor
//        Similarly we also cant create Abstract Constructor of parent class

//        Static
//        Abstract Method needs to be Overridden but static method cant be overridden
//        But We can Create Static method In Abstract Classes
        Parent.hello();



    }
}
