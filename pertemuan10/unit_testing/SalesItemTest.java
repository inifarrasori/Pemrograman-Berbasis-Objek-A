import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SalesItemTest {
    private SalesItem item;

    @BeforeEach
    public void setUp() {
        // Initialize a fresh object before every test
        item = new SalesItem("Java Programming Book", 4500);
    }

    @Test
    public void testInit() {
        assertEquals("Java Programming Book", item.getName());
        assertEquals(4500, item.getPrice());
        assertEquals(0, item.getNumberOfComments());
    }

    @Test
    public void testAddComment() {
        boolean result = item.addComment("Alice", "Great book!", 5);
        assertTrue(result);
        assertEquals(1, item.getNumberOfComments());
    }

    @Test
    public void testInvalidRating() {
        // Test rating too high
        assertFalse(item.addComment("Bob", "Bad", 6));
        // Test rating too low
        assertFalse(item.addComment("Charlie", "Bad", -1));
        assertEquals(0, item.getNumberOfComments());
    }

    @Test
    public void testDuplicateAuthor() {
        item.addComment("Alice", "First comment", 4);
        // Alice should not be allowed to comment a second time
        boolean result = item.addComment("Alice", "Second comment", 2);
        assertFalse(result);
        assertEquals(1, item.getNumberOfComments());
    }

    @Test
    public void testRemoveComment() {
        item.addComment("Alice", "Good", 5);
        item.removeComment(0);
        assertEquals(0, item.getNumberOfComments());
    }

    @Test
    public void testFindMostHelpful() {
        item.addComment("Alice", "Helpful", 5);
        item.addComment("Bob", "Not helpful", 2);
        
        // Bob gets an upvote, Alice gets a downvote
        item.upvoteComment(1); 
        item.downvoteComment(0);
        
        Comment helpful = item.findMostHelpfulComment();
        assertEquals("Bob", helpful.getAuthor());
    }
}
