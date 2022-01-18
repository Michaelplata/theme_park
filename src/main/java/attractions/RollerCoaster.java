package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() >= 145 & visitor.getAge() >= 12;
    }

    public double startingPrice(){
        return 8.40;
    }

    public double price(Visitor visitor){
        if(visitor.getHeight() > 2.0){
            return startingPrice() * 2;
        }
        return startingPrice();
    }


}
