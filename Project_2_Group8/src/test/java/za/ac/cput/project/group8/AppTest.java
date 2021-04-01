package za.ac.cput.project.group8;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        //Assert.that(true, "dhhhdgbnc");  
                
    }

    /**
     * Test of main method, of class App.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class App.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int num1 = 0;
        int num2 = 0;
        int expResult = 0;
        int result = App.add(num1, num2);
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //     fail("The test case is a prototype.");
    }
}
