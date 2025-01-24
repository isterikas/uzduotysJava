import itadesign.beerdrinker.BeerFactory;
import itadesign.beerdrinker.DefaultBeerBottle;
import itadesign.beerdrinker.NoMoreMaltException;

public class Kasztelan implements BeerFactory {
    private double reserves;

    public Kasztelan() {
        reserves = 1000;
    }

    @Override
    public void receiveMaltShippment(double v) {
        reserves += v * 1000;
    }

    public double getReserves() {
        return reserves;
    }

    @Override
    public DefaultBeerBottle produceNextBeerBottle() throws NoMoreMaltException {
        if (reserves < 25) {
            throw new NoMoreMaltException("No more malt mi lord");
        } else {
            reserves -= 25;
            return new DefaultBeerBottle(0.4, 5.1);
        }
    }
}
