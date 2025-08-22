import com.example.java_pandas.WordCounter;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WordCounterTest {

    @Test
    public void testValidWordCounter() {
        WordCounter wordCounter = new WordCounter();
        String re = wordCounter.takeWord("hello world qwerty world",2);
        assertEquals("Processed: hello world qwerty world; n = 2", re);
    }

    @Test
    public void testEmptyWordCounter() {
        WordCounter wordCounter = new WordCounter();
        String re = wordCounter.takeWord("",2);
        assertEquals("Processed: (Empty); n = 2", re);
    }
    @Test
    public void testOutOfRangeWordCounter() {
        WordCounter wordCounter = new WordCounter();
        String re = wordCounter.takeWord("hello world qwerty world",7);
        assertEquals("Processed: hello world qwerty world; n = 7", re);
    }


}
