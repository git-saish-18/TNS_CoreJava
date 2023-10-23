package tnsif.org.junittesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;  
  
public class TestLogin {  
  
    @Test  
    public void testFindMax(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    } 
    @Test  
    public void testfact(){  
        assertEquals(24,Calculation.fact(4));  
        assertEquals(120,Calculation.fact(5));  
    } 
    @Test  
    public void testisprime(){  
        assertEquals(false,Calculation.isprime(4));  
        assertEquals(true,Calculation.isprime(5));  
    } 
    
    @Test
    void testAssertEqual() {
    	 assertEquals("ABC", "ABC");
    	 assertEquals(2 + 2, 4);
    }

//    @Test
//    void testAssertFalse() {
//    	 assertFalse("FirstName".length() == 10);
//    }
//
//    @Test
//    void testAssertNull() {
//         String str1 = null;
//    	 String str2 = "abc";
//    	 assertNull(str1);
//    	 assertNotNull(str2);	
//    }
//
//    @Test
//    void testAssertAll() {
//    	 String str1 = "abc";
//    	 String str2 = "pqr";
//    	 String str3 = "xyz";
//    	 assertAll("numbers",
//    	      () -> assertEquals(str1,"abc"),
//    		  () -> assertEquals(str2,"pqr"),
//    		  () -> assertEquals(str3,"xyz")
//    	 );
    }

}  