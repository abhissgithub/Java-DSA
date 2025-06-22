package OOP.INHERITANCE;

public class main {
    public static void main(String[] args) {
//        BOX box1=new BOX();
//        System.out.println(box1.l+" "+box1.w+" "+box1.h);
//        BOX box2=new BOX(4);
//        System.out.println(box2.l +" "+box2.h +" "+ box2.w);
//        BOX box3=new BOX(4.7,5.9,4.8);
//        System.out.println(box3.l+" "+box3.w+" "+box3.h);

//        BOXWEIGHT box1=new BOXWEIGHT(4.5,5.6,6.7,4.5);
//        System.out.println(box1.h+" "+ box1.l+" "+box1.w);
//
//        BOX box5= new BOXWEIGHT(4,5,6,7);
//        System.out.println(box5.weight );

//        There Are Many numbers of variables in both child and parent classes
//        You are given access to variable that are in the reference type i.e. BOXWEIGHT
//        So you can access variables from parent class
//        That also means that the ones you are trying to access should be initialised
//        But here object itself is a type of parent class, so we can't call the constructor.
//        This is why error

//        BOXWEIGHT box6 = new BOX(2,3,4); // Here We access from parent class i.e. parent cass doesn't know what happened in child class
//                             || BOX is a constructor of above class and above class doesn't know what is happening below
//        That is why there is error
//        System.out.println(box6.weight);
        BOXPRIZE box7 = new BOXPRIZE(6.6, 6.7, 6.7);
        System.out.println("BOX7 is " + box7.side);
    }
}
