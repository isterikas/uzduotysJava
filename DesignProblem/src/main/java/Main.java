import itadesign.beerdrinker.NoMoreMaltException;

public class Main {
    public static void main(String[] args) throws NoMoreMaltException {
        Kasztelan kasztelan = new Kasztelan();
        System.out.println(kasztelan.getReserves());
        kasztelan.receiveMaltShippment(2.0);
        System.out.println(kasztelan.getReserves());
        kasztelan.produceNextBeerBottle();
        System.out.println(kasztelan.getReserves());
    }
}