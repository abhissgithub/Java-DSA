package OOP.INTERFACES;

public class Car implements Engine,Brake,Media {

int a=20;
    @Override
    public void brake() {
        System.out.println("Im simple break");
    }

    @Override
    public void start() {
        System.out.println("im start like simple car");

    }

    @Override
    public void stop() {
        System.out.println("Im stop like simple car");

    }

    @Override
    public void accelerate() {
        System.out.println("Im accelerate like simple car");

    }
}
