import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CommentTest {

    @Test
    public void testCommentCreation() {
        Comment comment = new Comment("John", "Nice", 4);
        assertEquals("John", comment.getAuthor());
        assertEquals(0, comment.getVoteCount());
    }

    @Test
    public void testVoting() {
        Comment comment = new Comment("John", "Nice", 4);
        comment.upvote();
        comment.upvote();
        comment.downvote();
        assertEquals(1, comment.getVoteCount());
    }
}