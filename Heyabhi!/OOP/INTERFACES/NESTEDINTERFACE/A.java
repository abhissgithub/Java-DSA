package OOP.INTERFACES.NESTEDINTERFACE;

//    top level Interface has to be declared public or default one
    public class A {

//    Nested Interfaces should be declared as a public/private/protected
    public interface Nestedinterface {
        public boolean isoddd(int num);

    }
}
 class B implements A.Nestedinterface {
    @Override
    public boolean isoddd(int num) {
        return (num & 1) == 1;
    }
}

