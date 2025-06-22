package OOP.INTERFACES.EXTENDDEMO;

public interface A {

    abstract void M (String message);

    public default void B () {
        System.out.println("Hurray I'm a default method");
    }

    static void Static () {
        System.out.println("Im a static method Hurrayyy");
    }
}

    class D implements A {


        @Override
        public void M (String m){

        System.out.println("I was abstarct method but now I get Override ");

    }


        public static void main(String[] args) {

            D d = new D();
            A.Static();
            d.M("HEYYY");
            d.B();

        }

}
