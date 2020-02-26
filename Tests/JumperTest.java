import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumperTest {

    Jumper tester = new Jumper(15);

    @Test
    void juryNotes() {
    }

    @Test
    void juryFinalNote() {
    }

    @Test
    void jump() {
    }

    @Test
    void getHeight() {
        assertTrue(tester.getHeight() > 160);
        assertTrue(tester.getHeight() < 200);


    }

    @Test
    void getWeight() {

        assertTrue(tester.getWeight() > 60);
        assertTrue(tester.getWeight() < 90);
    }

    @Test
    void getStartingNo() {
        assertEquals(15, tester.getStartingNo());
    }

    @Test
    void getFirstJumpLength() {
    }

    @Test
    void setFirstJump() {
    }

    @Test
    void getSecondJumpLength() {
    }

    @Test
    void setSecondJump() {
    }

    @Test
    void getTotalLength() {
    }

    @Test
    void getFirstJumpStyle() {
    }

    @Test
    void getSecondJumpStyle() {
    }

    @Test
    void getFirstJumpNote() {
    }

    @Test
    void getSecondJumpNote() {
    }

    @Test
    void getTotalNote() {
    }
}