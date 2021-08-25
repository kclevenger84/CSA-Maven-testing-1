package com.bssd;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.Assert.*;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestHello {

   @Test
   public void testHelloWorld()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Hello.main(null);

     // assertion
     assertEquals("Hello world!", bos.toString().trim());
     //assertEquals("Hello world!", Hello.testReturn());

     // undo the binding in System
     System.setOut(originalOut);
   }
}
