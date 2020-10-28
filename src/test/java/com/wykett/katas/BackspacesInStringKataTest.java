package com.wykett.katas;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BackspacesInStringKataTest {
	@Test
    public void testCleanString() {
        final BackspacesInStringKata bis = new BackspacesInStringKata();
        assertEquals("ac", bis.cleanString("abc#d##c"));
        assertEquals("", bis.cleanString("abc####d##c#"));
        assertEquals("", bis.cleanString("#######"));
    }

}	
