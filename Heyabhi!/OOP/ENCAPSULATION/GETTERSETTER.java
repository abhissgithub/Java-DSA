package OOP.ENCAPSULATION;

public class GETTERSETTER {
    private int num;

// 
 public void Setvalue(int x) {
        num = x;
    }

    public int Getvalue() {
        return num;
    }
}
    class C{
        public static void main(String[] args) {
            GETTERSETTER A=new GETTERSETTER();
            A.Setvalue(100);
            System.out.println(A.Getvalue());
        }
    }

