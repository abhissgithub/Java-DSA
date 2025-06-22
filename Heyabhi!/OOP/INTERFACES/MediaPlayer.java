package OOP.INTERFACES;

public class MediaPlayer implements Media{
    @Override
    public void start(){
        System.out.println("Im media song starter");
    }
    @Override
    public void stop(){
        System.out.println("Im stopping media");
    }
}
