import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    @Test
    public void testisPalindrome() {
        //test isPalindrome(String word)
        assertTrue(palindrome.isPalindrome(""));
        assertTrue(palindrome.isPalindrome("a"));
        assertTrue(palindrome.isPalindrome("cs61b16sc"));
        assertFalse(palindrome.isPalindrome("cs61b16sC"));
        assertFalse(palindrome.isPalindrome("school"));
        assertTrue(palindrome.isPalindrome("%^%"));

        //test isPalindrome(String word, CharacterComparator cc)

        assertTrue(palindrome.isPalindrome("", new OffByOne()));
        assertTrue(palindrome.isPalindrome("a", new OffByOne()));
        assertTrue(palindrome.isPalindrome("flake", new OffByOne()));
        assertFalse(palindrome.isPalindrome("flakE", new OffByOne()));
        assertFalse(palindrome.isPalindrome("school", new OffByOne()));
        assertTrue(palindrome.isPalindrome("#$", new OffByOne()));
    }

}
