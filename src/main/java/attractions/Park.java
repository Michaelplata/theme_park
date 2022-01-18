package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;

public class Park extends Attraction implements ITicketed {

    public Park(String name, int rating) {
        super(name, rating);
    }
}
