package OOP.INHERITANCE;

public class BOXPRIZE extends BOXWEIGHT {
    double prize;

    public BOXPRIZE() {
        super();
        this.prize=prize;

    }
    BOXPRIZE(BOXPRIZE other){
        super(other);
        this.prize=other.prize;
    }
    public BOXPRIZE(double lenght, double height, double width, double weight, double prize) {
        super(lenght, height, width, weight);
        this.prize = prize;
    }
    BOXPRIZE(double side,double weight, double prize){
        super(side,weight);
        this.prize=prize;
    }
}
