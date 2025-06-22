package OOP.GENERICS.COMPARIABLE;

public class STUDENTS implements Comparable<STUDENTS> {
    int marks;
    private int rno;

    public STUDENTS(int marks,int rno) {
        this.marks = marks;
        this.rno=rno;
    }

    @Override
    public String toString() {
        return marks+" ";
    }

    @Override
    public int compareTo(STUDENTS o) {
        int dif=this.marks-o.marks;

//        if diff<0 o has less marks else more marks

        return dif;
    }
}
