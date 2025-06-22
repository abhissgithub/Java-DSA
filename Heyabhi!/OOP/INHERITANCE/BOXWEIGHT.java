package OOP.INHERITANCE;

public class BOXWEIGHT extends BOX {
    double weight;

    public BOXWEIGHT() {
        this.weight = -1;

    }
    BOXWEIGHT(double l,double h,double w){

    }
    BOXWEIGHT(BOXWEIGHT other){
        super(other);
        weight=other.weight;

    }

    public BOXWEIGHT(double lenght, double height, double width, double weight) {

        super(lenght, height, width); // It initializes the value present in parent class
//        Super Actually call the parent class constructor
        this.weight = weight;
//        We Can also use this keyword for accessing variables
//        But For Accessing variable directly from super class we use super keyword.
        System.out.println(this.weight);      // cntl + click
        System.out.println(super.weight);
    }
    BOXWEIGHT(double side,double weight){
        super(side);
        this.weight=weight;
    }
}

