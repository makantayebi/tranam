package transnam;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class PersianWordTest {
    PersianWord word1 = new PersianWord("کلمة");
    PersianWord word2 = new PersianWord("کلمه");
    PersianWord word3 = new PersianWord("کلم");
    PersianWord word4 = new PersianWord("گ");
    PersianWord word5 = new PersianWord("الف");
    PersianWord word6 = new PersianWord("ال ف");

    @Test
    public void testEqual() {
        assertTrue("General Comparison works.", !word1.equals(word3));
        assertTrue("Ignoring arabic equivalents of Persian letters works.", word1.equals(word2));
        assertTrue("Removing white space works.", word5.equals(word6));
    }

    @Test
    public void comparisonAndHash() {
        List<PersianWord> words = new ArrayList<>();
        words.add(word1);
        words.add(word2);
        words.add(word3);
        words.add(word4);
        words.add(word5);
        Collections.sort(words);
        int i = 0;
        for (PersianWord word : words) {
            if (i == 0 && word.equals("الف")) {
                assertTrue("Sorting the first letter worked.", true);
            } else if(i == 0) {
                assertTrue("Sorting the first letter did NOT work.", false);
            }
            if (i == 4 && word.equals(word4)) {
                assertTrue("Sorting the last letter worked.", true);
            } else if(i == 4) {
                assertTrue("Sorting the last letter did NOT work.", false);
            }
            i++;
        }

    }
}
