
import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){ manager  = new Manager ("Gerald", "js563883", 80900.00, "Giraffe");
    }
    @Test
    public void canGetDeptName(){
        assertEquals("Giraffe", manager.getDeptName());
    }

}