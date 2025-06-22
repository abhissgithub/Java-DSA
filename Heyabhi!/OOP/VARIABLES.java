package OOP;

import java.util.Arrays;

public class VARIABLES {
    public static void main(String[] args) {
        Student[] students=new Student[5];
        Student kunal =new Student();
        kunal.greet();
//        System.out.println(kunal.name);
//        System.out.println(kunal.Marks);

    }
     static class Student{
        int rno;
        String name;
        int Marks;
         void greet(){
             System.out.println("My name Is "+this.name);

         }
         Student kunal = new Student();
        Student(){
            this.name="abhi";
            this.Marks=34;
        }


    }

}
