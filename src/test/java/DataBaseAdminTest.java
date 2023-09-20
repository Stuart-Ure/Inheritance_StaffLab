import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

import techStaff.DataBaseAdmin;

public class DataBaseAdminTest  {
  DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){ dataBaseAdmin = new DataBaseAdmin("Geoff", "poiuyt", 25000.00);
    }
    @Test
    public void canGetName(){
        assertEquals("Geoff", dataBaseAdmin.getName());
    }
    @Test
    public void canGetNiNumber(){
        assertEquals("poiuyt", dataBaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000.00, dataBaseAdmin.getSalary());
    }

    @Test
    public void canGetRaise(){
       dataBaseAdmin.raiseSalary(500.00);
        assertEquals(25500.00, dataBaseAdmin.getSalary());
    }

    @Test
    public void testPayBonus() {
        assertEquals(250.0, dataBaseAdmin.payBonus(), 0.01);
    }

}
