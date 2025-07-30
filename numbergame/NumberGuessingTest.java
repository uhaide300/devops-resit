
package numbergame;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumberGuessingTest {

    @Test
    public void testProvideHint() {
        assertEquals("Try higher.", NumberGuessing.provideHint(30, 50));
        assertEquals("Try lower.", NumberGuessing.provideHint(75, 60));
        assertEquals("Correct!", NumberGuessing.provideHint(20, 20));
    }
}
