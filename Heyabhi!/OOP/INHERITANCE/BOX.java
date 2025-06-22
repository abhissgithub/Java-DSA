package OOP.INHERITANCE;

public class BOX {
    double l;
    double h;
    double w;
    double weight;
    double side;

    public BOX() {
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    //    Cube
    BOX(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }
    BOX(double lenght,double height, double width){

        this.l=lenght;
        this.w=width;
        this.h=height;
    }
    BOX(BOX old){
        this.l=l;
        this.h=h;
        this.w=w;

    }
    public void info(){
        System.out.println("The perimeter of box is");

    }
}
