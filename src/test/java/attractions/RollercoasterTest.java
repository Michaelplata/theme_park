package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(20, 2.01, 15.0);
        visitor2 = new Visitor(10, 1.44, 39.0);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void chargeDoubleForTall(){
        assertEquals(16.80, rollerCoaster.price(visitor), 0.0);
    }

    @Test
    public void canImplementSecurityMeasures(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }
}
