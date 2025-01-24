import itadesign.beerdrinker.BeerBottle;
import itadesign.beerdrinker.BeerConsumer;

public class Henryk extends BeerConsumer {
    @Override
    protected boolean shouldConsumeBeer(BeerBottle beerBottle) {
        return !(beerBottle.getVolumeInLiters() > 0.5) && !(beerBottle.getAlcoholContentInPercent() > 6) && !(getBloodAlcoholContentInLiters() > 0.120);

    }

    @Override
    public BeerBottle showBeerBottleToAStranger(BeerBottle beerBottle, boolean b) {
        if (!b) {
            return beerBottle;
        }
        return new BeerBottleCovered(beerBottle);
    }
}
