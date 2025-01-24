import itadesign.beerdrinker.BeerBottle;
import itadesign.beerdrinker.DefaultBeerBottle;

public class BeerBottleCovered implements BeerBottle {
    private BeerBottle beerBottle;

    public BeerBottleCovered(BeerBottle beerBottle) {
        this.beerBottle = beerBottle;
    }


    @Override
    public double getAlcoholContentInPercent() {
        return 0.0;
    }

    @Override
    public double getVolumeInLiters() {
        return beerBottle.getVolumeInLiters();
    }

    @Override
    public void takeASip(double v) {
        beerBottle.takeASip(v);
    }
}
