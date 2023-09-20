import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

import techStaff.Developer;


public class DeveloperTest  {
    Developer developer;

    @Before
    public void before(){ developer = new Developer("Garry", "abcderg", 50000.00);
    }
    @Test
    public void canGetName(){
        assertEquals("Garry", developer.getName());
    }
    @Test
    public void canGetNiNumber(){
        assertEquals("abcderg", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000.00, developer.getSalary());
    }

    @Test
    public void canGetRaise(){
        developer.raiseSalary(500.00);
        assertEquals(50500.0, developer.getSalary());
    }

    @Test
    public void testPayBonus() {
        assertEquals(500.00, developer.payBonus(), 0.01);
    }

}
