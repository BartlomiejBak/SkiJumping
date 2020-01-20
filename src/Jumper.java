import java.util.Arrays;

/**
 * @author bartlomiej.bak
 */
public class Jumper {

    private int startingNo;
    private int height;
    private int weight;
    private double firstJumpLength = 0;
    private double firstJumpStyle = 0;
    private double firstJumpNote = 0;
    private double secondJumpLength = 0;
    private double secondJumpStyle = 0;
    private double secondJumpNote = 0;
    private double totalLength = getFirstJumpLength() + getSecondJumpLength();
    private double totalStyle = 0;
    private double totalNote = 0;
    public double[] notes = {16.0, 16.5, 17.0, 17.5, 18.0, 18.5, 19.0, 19.5, 20.0};

    /**
     * Creates new jumper with variable height (160-200 cm) and weight (60-80 kg)
     * @param i starting number
     */
    public Jumper(int i) {
        this.startingNo = i;
        this.height = (int)(200-Math.random()*40);
        this.weight = (int)(80-Math.random()*20);
    }

    /**
     *
     * @return array of 5 jury notes per jump
     */
    public double[] juryNotes(){
        double[] jNotes = new double[5];
        for (double note:jNotes) {
            note = this.notes[(int)(Math.random()*9)];
        }
        return jNotes;
    }

    /**
     *
     * @return final jury note for jump
     */
    public double juryFinalNote(){
        double[] sum = this.juryNotes();
        Arrays.sort(sum);
        return sum[1] + sum[2] + sum[3];
    }

    /**
     *
     * @return length of jump
     */
    public double jump(){
        int baseJump = 100;
        return (baseJump + (Math.random() * 60 * getWeight() / getHeight()));
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getStartingNo() {
        return startingNo;
    }

    public double getFirstJumpLength() {
        return firstJumpLength;
    }

    public void setFirstJumpLength() {
        this.firstJumpLength = this.jump();
        this.totalLength = this.getFirstJumpLength() + this.getSecondJumpLength();
    }

    public double getSecondJumpLength() {
        return secondJumpLength;
    }

    public void setSecondJumpLength() {
        this.secondJumpLength = this.jump();
        this.totalLength = this.getFirstJumpLength() + this.getSecondJumpLength();
    }

    public double getTotalLength() {
        return totalLength;
    }

    public double getFirstJumpStyle() {
        return firstJumpStyle;
    }

    public void setFirstJumpStyle(double firstJumpStyle) {
        this.firstJumpStyle = firstJumpStyle;
    }

    public double getSecondJumpStyle() {
        return secondJumpStyle;
    }

    public void setSecondJumpStyle(double secondJumpStyle) {
        this.secondJumpStyle = secondJumpStyle;
    }

    public double getTotalStyle() {
        return totalStyle;
    }

    public void setTotalStyle(double totalStyle) {
        this.totalStyle = totalStyle;
    }

    public double getFirstJumpNote() {
        return firstJumpNote;
    }

    public void setFirstJumpNote(double firstJumpNote) {
        this.firstJumpNote = firstJumpNote;
    }

    public double getSecondJumpNote() {
        return secondJumpNote;
    }

    public void setSecondJumpNote(double secondJumpNote) {
        this.secondJumpNote = secondJumpNote;
    }

    public double getTotalNote() {
        return totalNote;
    }

    public void setTotalNote(double totalNote) {
        this.totalNote = totalNote;
    }
}
