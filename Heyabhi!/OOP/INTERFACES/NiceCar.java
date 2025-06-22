package OOP.INTERFACES;

public class NiceCar {
   private Engine engine;
   private Media media=new MediaPlayer();
   public NiceCar(){
       engine = new PowerEngine();
   }
    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
       engine.start();
    }
    public void stop(){
       engine.stop();
    }
    public void musicstart(){
       media.start();
    }
    public void musicstop(){
        media.stop();
    }
    public void UpgradeEngine(){
       this.engine=new ElectricEngine();
    }


}
