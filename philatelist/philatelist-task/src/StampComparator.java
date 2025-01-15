import lt.techin.philatelist.PostStamp;

import java.util.Comparator;

public class StampComparator implements Comparator<PostStamp> {

    @Override
    public int compare(PostStamp p1, PostStamp p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
