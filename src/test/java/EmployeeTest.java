import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EmployeeTest {
    Employee employee;

    @Before
    public void before(){ employee  = new Employee("Georgina", "js56767", 30900.00);
    }
    @Test
    public void canGetName(){
        assertEquals("Georgina", employee.getName());
    }
    @Test
    public void canGetNiNumber(){
        assertEquals("js56767", employee.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30900.00, employee.getSalary());
    }

    @Test
    public void canGetRaise(){
        employee.raiseSalary(100.00);
        assertEquals(31000.00, employee.getSalary());
    }

    @Test
    public void testPayBonus() {
        assertEquals(309.00, employee.payBonus(), 0.01);
    }

}
