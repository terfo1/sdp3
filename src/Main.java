interface Audio{
    void startmusic();
    void stopmusic();
}
class iPod{
    void iPodplay(){
        System.out.println("iPod started to play");
    }
    void iPodstop(){
        System.out.println("iPod turned off");
    }
}
class SonyPlayer{
    void Sonyplay(){
        System.out.println("Sony started to play");
    }
    void Sonystop(){
        System.out.println("Sony turned off");
    }
}
    class iPodAdapter implements Audio{
    iPod iPod;
    public iPodAdapter(iPod iPod){
        this.iPod=iPod;
    }
    public void startmusic(){
        iPod.iPodplay();
    }
    public void stopmusic(){
        iPod.iPodstop();
    }
}
class SonyAdapter implements Audio{
    SonyPlayer SonyPlayer;
    public SonyAdapter(SonyPlayer SonyPlayer){
        this.SonyPlayer= SonyPlayer;
    }
    public void startmusic(){
        SonyPlayer.Sonyplay();
    }
    public void stopmusic(){
        SonyPlayer.Sonystop();
    }
}
public class Main {
    public static void main(String[] args) {
        Audio iPodad=new iPodAdapter(new iPod());
        Audio Sonyad=new SonyAdapter(new SonyPlayer());
        iPodad.startmusic();
        Sonyad.stopmusic();
    }
}
