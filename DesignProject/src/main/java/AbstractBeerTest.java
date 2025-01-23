import itadesign.beerdrinker.BeerConsumer;
import itadesign.beerdrinker.BeerFactory;
import itadesign.beerdrinker.NoMoreMaltException;

public abstract class AbstractBeerTest {
    protected abstract BeerConsumer getBeerConsumer();
    protected abstract BeerFactory getBeerFactory();
    void	policeAndFriendInspections(){}
    void	testAddingMalt() throws NoMoreMaltException{}
    void	testBeerConsumerChoices(){}
    void	testBeerFactoryAndConsumerExistence(){}
    void	testInitialBeerFactoryProduction()throws NoMoreMaltException{}
}
