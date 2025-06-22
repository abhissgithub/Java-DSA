package OOP.INTERFACES;

import java.util.ArrayList;
import java.util.Arrays;

interface CAAR {
    default void speed(){
        System.out.println("speed limit is 50");
    }
    default void brea(){
        System.out.println("Apply break");
    }
    // Static method only can invoke by interface name
    static void horsepower(){
        System.out.println("Horsepower is applied");
    }


    void star();
    void stop();
}
class Start implements CAAR {
    @Override
    public void star() {
        System.out.println("car start");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped");
    }
}

class stopp implements CAAR{
    @Override
    public void star() {
        System.out.println("Stoppers start");
    }

    @Override
    public void stop() {
        System.out.println("Stoppers stop");
    }

}

class abstractexample {

    public static void main(String[] args) {
        CAAR n = new stopp();
        n.star();
        n.stop();
        n.speed();
        n.brea();

        // Static method only can invoke by interface name
        CAAR.horsepower();
        ArrayList a = new ArrayList<>();

    }

}
