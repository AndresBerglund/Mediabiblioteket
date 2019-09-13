/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediabiblioteket;

import collections.LinkedList;
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
public class DVDTest {
    
    public DVDTest() {
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
     * Test of getActors method, of class DVD.
     */
    @Test
    public void testGetActors() {
        System.out.println("getActors");
        LinkedList<String> getActors = new LinkedList();
        getActors.add("actor01");
        getActors.add("actor02");
        getActors.add("actor03");
        getActors.add("actor04");
        getActors.add("actor05");
        
        DVD instance = new DVD("","","", 1, getActors);
        
        LinkedList<String> expResult = getActors ;
        LinkedList<String> actResult = instance.getActors();
        
        
        assertEquals(expResult, actResult);
        System.out.println("expResult = " + expResult);
        System.out.println("actResult = " + actResult);
        System.out.println("");
        
    }

    /**
     * Test of setActors method, of class DVD.
     */
    @Test
    public void testSetActors() {
        System.out.println("setActors");
        LinkedList<String> setActors = new LinkedList();
        setActors.add("actor01");
        setActors.add("actor02");
        setActors.add("actor03");
        setActors.add("actor04");
        setActors.add("actor05");
        
        LinkedList<String> actors = new LinkedList();
        DVD instance = new DVD("","","",1,actors);
        instance.setActors(setActors);
        
        LinkedList<String> expResult = setActors ;
        LinkedList<String> actResult = instance.getActors();
        assertEquals(expResult, actResult);
        
        System.out.println("expResult = " + expResult);
        System.out.println("actResult = " + actResult);
        System.out.println("");
        
    }

    /**
     * Test of toString method, of class DVD.
     */
    @Test
    public void testToString() {
       //public DVD(String mediaType, String title, String objectID, int year, LinkedList<String> actors)
       //mediaType + " - " + borrowed + " - " + title + " - " + getYear() + " - " + actors.toString();
        System.out.println("testToString");
        
        String mediaType = "mediaType";
        String borrowed = "Free";
        String title = "title";
        int getYear = 1;                    
        LinkedList<String> actors = new LinkedList<>();
        actors.add("Simon");
        actors.add("Andres");
        
        DVD instance = new DVD(mediaType, title, "000", getYear,actors);
      
        String testString = instance.toString();
        
        System.out.println("Comparing: \n" + testString);
       
        boolean temp = testString.contains(mediaType);
            
            System.out.println("Looked for: " + mediaType + ", Found: " + temp);
            
        if (temp == true) {

            temp = testString.contains(borrowed);
            System.out.println("Looked for: " + borrowed + ", Found: " + temp);

        if (temp == true) {

            temp = testString.contains(title);
            System.out.println("Looked for: " + title + ", Found: " + temp);

        }
        if (temp == true) {

            temp = testString.contains("" + getYear);
            System.out.println("Looked for: " + getYear + ", Found: " + temp);

        }
        if (temp == true) {

            temp = testString.contains(actors.toString());
            System.out.println("Looked for: " + actors + ", Found: " + temp);

       

            }

            boolean expResult = true;
            boolean actResult = temp;

            assertEquals(expResult, actResult);

 
      
        
     
    }
    }

    /**
     * Test of listInfo method, of class DVD.
     */
    
    
    @Test
        public void testListInfo() {
        System.out.println("listInfo");
        
        String mediaType = "mediaType";
        String title = "title"; 
        int getYear = 1;   
        String actor = "actor";
        String borrowed = "Free";
        String ID = "000";
        
        Book instance = new Book(mediaType,title,ID,getYear,actor);
        
       
        String actResult = instance.listInfo();
        
        boolean temp = actResult.contains(mediaType);
             System.out.println("Looked for: " + mediaType + ", Found: " + temp);
            
        
        if (temp == true) {

                 temp = actResult.contains(title);
                 System.out.println("Looked for: " + title + ", Found: " + temp);

        }
        if (temp == true) {

                 temp = actResult.contains("" + getYear);
                 System.out.println("Looked for: " + getYear + ", Found: " + temp);

        }
        if (temp == true) {

                 temp = actResult.contains(actor);
                 System.out.println("Looked for: " + actor + ", Found: " + temp);

        if (temp == true) {
                
                 temp = actResult.contains(borrowed);
                 System.out.println("Looked for: " + borrowed + ", Found: " + temp);

            }
         if (temp == true) {
                
                 temp = actResult.contains(ID);
                 System.out.println("Looked for: " + ID + ", Found: " + temp);

            }

            boolean expResult = true;
            boolean Result = temp;

            assertEquals(expResult, Result);
    }
    
}
}
