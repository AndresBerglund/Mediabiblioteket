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
public class BookTest {

    public BookTest() {
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
     * Test of getAuthor method, of class Book.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("testGetAuthor");
        
        String author = "getAuthor";
        Book instance = new Book("", "", "", 1, author);
        String expResult = "getAuthor";
        String actResult = instance.getAuthor();
        
       
        
        
        assertEquals(expResult, actResult);

        System.out.println("expResult = " + expResult);
        System.out.println("actResult = " + actResult);
        System.out.println("");
    }

    /**
     * Test of setAuthor method, of class Book.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("testSetAuthor");

        String author = "setAuthor";
        Book instance = new Book("", "", "", 1, "OldAuthor");
        
        instance.setAuthor(author);
        
        String expResult = "setAuthor";
        
        String actResult = instance.getAuthor();
        
        
        assertEquals(expResult, actResult);

        System.out.println("expResult = " + expResult);
        System.out.println("actResult = " + actResult);
        System.out.println("");
    }

    /**
     * Test of toString method, of class Book.
     */
    @Test
    public void testToString() {
        System.out.println("testToString");
        //Book(String mediaType, String title, String objectID, int year, String author)
        //mediaType + " - " + borrowed + " - " + title + " - " + getYear() + " - " + Author;
        
        String mediaType = "mediaType";
        String borrowed = "Free";
        String title = "title";
        int getYear = 1;
        String author = "author";

       
        Book instance = new Book(mediaType, title, "000", getYear, author);

        String actResult = instance.toString();
        System.out.println("Comparing: \n" + actResult);
       
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

                temp = actResult.contains(author);
                System.out.println("Looked for: " + author + ", Found: " + temp);

        if (temp == true) {

                temp = actResult.contains(borrowed);
                System.out.println("Looked for: " + borrowed + ", Found: " + temp);

            }

            boolean expResult = true;
            boolean Result = temp;

            assertEquals(expResult, Result);

        }
    }

    /**
     * Test of listInfo method, of class Book.
     */
    @Test
    public void testListInfo() {
        System.out.println("listInfo");
        
        String mediaType = "mediaType";
        String title = "title"; 
        int getYear = 1;   
        String author = "author";
        String borrowed = "Free";
        String ID = "000";
        
        Book instance = new Book(mediaType,title,ID,getYear,author);
        
       
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

                 temp = actResult.contains(author);
                 System.out.println("Looked for: " + author + ", Found: " + temp);

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
