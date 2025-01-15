import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PostStamp;

import java.lang.reflect.Array;
import java.util.*;

public class PhilatelistImpl implements Philatelist {
    private ArrayList<PostStamp> collection = new ArrayList<>();

    @Override
    public void addToCollection(PostStamp postStamp) {
        if (postStamp == null) {
            throw new IllegalArgumentException();
        }
        if (postStamp.getName() == null) {
            throw new IllegalArgumentException();
        }
        if (postStamp.getName().isEmpty()) {
            throw new IllegalArgumentException();
        }

        if (!collection.contains(postStamp)) {
            collection.add(postStamp);
        }
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return collection.size();
    }

    @Override
    public void printAllPostStampNames() {
        for (PostStamp stamp : collection) {
            System.out.println(stamp.getName());
        }
    }

    @Override
    public void printPostStampsWithPriceGreaterThan(double v) {
        for (PostStamp stamp : collection) {
            if (stamp.getMarketPrice() > v) {
                System.out.println(stamp.getName());
            }
        }
    }

    @Override
    public boolean isPostStampInCollection(PostStamp postStamp) {
        return collection.contains(postStamp);
    }

    @Override
    public boolean isPostStampWithNameInCollection(String s) {
        for (PostStamp stamp : collection) {
            return stamp.getName().equals(s);
        }
        return false;
    }

    @Override
    public double calculateTotalMarketPrice() {
        double sum = 0;
        for (PostStamp stamp : collection) {
            sum += stamp.getMarketPrice();
        }
        return sum;
    }

    @Override
    public double getAveragePostStampPrice() {
        return calculateTotalMarketPrice() / collection.size();
    }

    @Override
    public PostStamp getTheMostExpensivePostStampByMarketValue() {
        double mostExpensive = 0.0;
        PostStamp mostExpensiveStamp = null;
        for (PostStamp stamp : collection) {
            mostExpensive = Math.max(mostExpensive, stamp.getMarketPrice());
            mostExpensiveStamp = mostExpensive > stamp.getMarketPrice() ? mostExpensiveStamp : stamp;
        }
        return mostExpensiveStamp;
    }

    @Override
    public List<PostStamp> findPostStampsByNameContaining(String s) {
        List<PostStamp> containing = new ArrayList<>();
        for (PostStamp stamp : collection) {
            if (stamp.getName().contains(s)) containing.add(stamp);
        }
        return containing;
    }

    @Override
    public List<PostStamp> getSortedPostStampsByName() {
        collection.sort(new Comparator<PostStamp>() {

            @Override
            public int compare(PostStamp p1, PostStamp p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        return collection;
    }
}
