import org.junit.Test;

public class NumberGuessingTest {

    @Test
    public void testMethodRunsWithoutCrashing() {
        try {
            NumberGuessing.guessingNumberGame();
        } catch (Exception e) {
            assert false : "Method should not throw an exception, but got: " + e.getMessage();
        }
    }
}
