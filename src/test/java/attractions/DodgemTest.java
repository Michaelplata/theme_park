package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor = new Visitor(10, 1.5, 20.00);
        visitor2 = new Visitor(15, 1.6, 23.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canDiscountPrice(){
        assertEquals(2.25, dodgems.price(visitor), 0.0);
    }

    @Test
    public void noDiscountPrice(){
        assertEquals(4.50, dodgems.price(visitor2), 0.0);
    }
}
