/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediabiblioteket;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NewDay
 */
public class BorrowerTest {
    
    public BorrowerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setName method, of class Borrower.
     */
    @Test
    public void testSetName() {
        System.out.println("");
        String name = "Lisa Svensson";
        Borrower instance = new Borrower("Harald Svensson","891216-1111","040-471024");
        System.out.println(instance.getName());
        instance.setName(name);
        System.out.println(instance.getName());
        
        String expResult = name;
        String Result = instance.getName();
        
        assertEquals(expResult,Result );
        
        
       
    }
              
    /**
     * Test of setSsn method, of class Borrower.
     */
    @Test
    public void testSetSsn() {
        System.out.println("setSsn");
        String ssn = "NEW-SSN";
        Borrower instance = new Borrower("name","SSN","Tel");
        instance.setSsn(ssn);
        String expResult = ssn;
        String Result = instance.getSsn();
        
        assertEquals(expResult , Result);
       
    }

    /**
     * Test of setphoneNumber method, of class Borrower.
     */
    @Test
    public void testSetphoneNumber() {
        System.out.println("setphoneNumber");
        String phoneNumber = "";
        Borrower instance = null;
        instance.setphoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSsn method, of class Borrower.
     */
    @Test
    public void testGetSsn() {
        System.out.println("getSsn");
        Borrower instance = null;
        String expResult = "";
        String result = instance.getSsn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Borrower.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Borrower instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getphoneNumber method, of class Borrower.
     */
    @Test
    public void testGetphoneNumber() {
        System.out.println("getphoneNumber");
        Borrower instance = null;
        String expResult = "";
        String result = instance.getphoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
