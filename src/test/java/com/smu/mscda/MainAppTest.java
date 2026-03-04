package com.smu.mscda;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainAppTest {

    @Test
    public void testCapitalizeString() {
        // Test: capitalization of a lowercase input string
        assertEquals("Smu", MainApp.capitalizeString("smu"));
    }

    @Test
    public void testGenerateMD5() {
        // Test: MD5 of the capitalized string "Smu" (matches assignment expected output)
        String capitalized = MainApp.capitalizeString("smu"); // produces "Smu"
        String expectedHex = "6850c0ee0db4626bbdda5660167f0d4c";
        assertEquals(expectedHex, MainApp.generateMD5(capitalized));
    }
}
