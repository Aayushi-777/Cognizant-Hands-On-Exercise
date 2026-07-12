package com.example.junitbasic;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
class StringUtilityTest {
    StringUtility utility;
    @BeforeEach
    void setup() {
        utility = new StringUtility();

    }
    @AfterEach
    void cleanup() {
        utility = null;

    }
    @Test
    void testReverse() {
        String result = utility.reverse("hello");
        assertEquals("olleh", result);

    }
    @Test
    void testPalindromeTrue() {
        assertTrue(utility.isPalindrome("madam"));

    }
    @Test
    void testPalindromeFalse() {
        assertFalse(utility.isPalindrome("apple"));

    }
}