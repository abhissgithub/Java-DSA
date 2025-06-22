package OOP;

// PLAYING WITH STATIC KEYWORD
public class Human {
    String name;
    int salary;
    int age;
    static long population;

    public Human() {
        this.name = name;
        this.salary = salary;
        this.age = age;
        Human.population+=1;
    }

    public static void main(String[] args) {
        // STOPSHIP: 24-01-2024

    }
    static void fun(){
        Human obj=new Human();
        obj.abhi();

    }
    void abhi(){
        System.out.println("abhishek");
    }
}
