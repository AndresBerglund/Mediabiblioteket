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
       
        String name = "setName";
        Borrower instance = new Borrower(name,"","");                   
        
        String expResult = "setName";
        String actResult = instance.getName();
        
     
        System.out.println("expResult = " + expResult);
        System.out.println("actResult = " + actResult);
        System.out.println("");
        assertEquals(expResult,actResult );
        
       
    }
              
    /**
     * Test of setSsn method, of class Borrower.
     */
    @Test
    public void testSetSsn() {
        String ssn = "setSsn";
        Borrower instance = new Borrower("",ssn,"");
       
        String expResult = "setSsn";
        String actResult = instance.getSsn();
        
        System.out.println("expResult = " + expResult);
        System.out.println("actResult = " + actResult);
        System.out.println("");
        assertEquals(expResult,actResult );
    }

    /**
     * Test of setphoneNumber method, of class Borrower.
     */
    @Test
    public void testSetphoneNumber() {
       
        String numer = "setNumber";
        Borrower instance = new Borrower("","",numer);
        String expResult = "setNumber";
        String actResult = instance.getphoneNumber();
        
        System.out.println("expResult = " + expResult);
        System.out.println("actResult = " + actResult);
        System.out.println("");
        assertEquals(expResult,actResult );
    }
    

    /**
     * Test of getSsn method, of class Borrower.
     */
    @Test
    public void testGetSsn() {
        Borrower instance = new Borrower ("","getSsn","");
        String expResult = "getSsn";
        String actResult = instance.getSsn();
        
        System.out.println("expResult = " + expResult);
        System.out.println("actResult = " + actResult);
        System.out.println("");
        
        assertEquals(expResult, actResult);
    }

    /**
     * Test of getName method, of class Borrower.
     */
    @Test
       
    public void testGetName() {
        
        Borrower instance = new Borrower("getName","","");
        String expResult = "getName";
        String actResult = instance.getName();
                
        System.out.println("expResult = " + expResult);
        System.out.println("actResult = " + actResult);
        System.out.println("");
        assertEquals(expResult,actResult);
    }

    /**
     * Test of getphoneNumber method, of class Borrower.
     */
    @Test
    public void testGetphoneNumber() {
        
        Borrower instance = new Borrower ("","","number");
        String expResult = "number";
        String actResult = instance.getphoneNumber();
                
        System.out.println("expResult = " + expResult);
        System.out.println("actResult = " + actResult);
        System.out.println("");
        assertEquals(expResult, actResult);
    }
    
}
