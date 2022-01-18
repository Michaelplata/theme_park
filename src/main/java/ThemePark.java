import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark implements IReviewed {

    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;

    private String name;
    private int rating;

    public ThemePark(String name, int rating){
        this.name = name;
        this.rating = rating;
        stalls = new ArrayList<>();
        attractions = new ArrayList<>();
    }
    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public String getName() {
        return name;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.incrementVisitCount();
        visitor.addToList(attraction);
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

    public int getAttractionCount(){
        return this.attractions.size();
    }

    public int getStallCount(){
        return this.stalls.size();
    }

}
