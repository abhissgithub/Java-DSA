package OOP.INTERFACES;

public class Main {
    public static void main(String[] args) {
//   What Things You Can access Depend on this --> Engine car = new Car();
//    Which one of those version to be accessed depend on this ---^
//    car.brake();
        Car car=new Car();

        car.stop();
        car.accelerate();

//        Here We Stop The Media Player but o/p is as Stop the engine
//        So for this we have to make new class for media Player
        Media carmedia=new Car();
        carmedia.stop();

//        So Here Is new Class
//        MediaPlayer mediaPlayer=new MediaPlayer();
//        mediaPlayer.start();

        NiceCar niceCar=new NiceCar();
        niceCar.start();
        niceCar.stop();
        niceCar.musicstart();
        niceCar.UpgradeEngine();
        niceCar.start();
    }



}
