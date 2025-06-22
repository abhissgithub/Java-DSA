package OOP.GENERICS.COMPARIABLE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        STUDENTS kunal=new STUDENTS(90,45);
        STUDENTS abhi = new STUDENTS(78,12);
        STUDENTS ab = new STUDENTS(95,62);
        STUDENTS ahi = new STUDENTS(68,32);
        STUDENTS abh = new STUDENTS(98,72);

        if (kunal.compareTo(abh)>0){
            System.out.println("abh has more marks");
        }
        else System.out.println("Kunal is topper");

       STUDENTS[] list={kunal,abh,abhi,ahi,ab};
        System.out.println(Arrays.toString(list));

//       Arrays.sort(list, (o1, o2) -> (o1.marks-o2.marks));  Lambda Functions
        Arrays.sort(list, Comparator.comparingInt(o -> o.marks));// can be also written as -----^

        System.out.println(Arrays.toString(list));


    }
}
