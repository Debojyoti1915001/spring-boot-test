package com.springtest.testapp.service;

import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;
@SpringBootTest
public class FactorialServiceTest {
    @Test
   public void testFactorial() {
      // assertEquals(String message, long expected, long actual)
       FactorialService f= new FactorialService();
      
      int val = f.factorial(5);
     System.out.println(val);
     assertEquals()
//       assertThrows(NullPointerException.class,()->f.factorial(5));
    }
}