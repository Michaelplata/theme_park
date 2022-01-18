package attractions;

import behaviours.IReviewed;
import people.Visitor;

public class Dodgems extends Attraction {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double startingPrice(){
        return 4.50;
    }

    public double price(Visitor visitor){
        if(visitor.getAge() < 12){
            return startingPrice() / 2;
        }
        return startingPrice();
    }
}
