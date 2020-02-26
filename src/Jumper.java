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
        for (int i = 0; i < 5; i++){
            jNotes[i] = this.notes[(int)(Math.random()*9)];
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

    public void setFirstJump() {
        this.firstJumpLength = this.jump();
        this.totalLength = this.getFirstJumpLength() + this.getSecondJumpLength();
        this.firstJumpStyle = this.juryFinalNote();
        this.firstJumpNote = getFirstJumpLength() + getFirstJumpStyle();
        this.totalNote = this.getFirstJumpNote() + this.getSecondJumpNote();
    }

    public double getSecondJumpLength() {
        return secondJumpLength;
    }

    public void setSecondJump() {
        this.secondJumpLength = this.jump();
        this.totalLength = this.getFirstJumpLength() + this.getSecondJumpLength();
        this.secondJumpStyle = this.juryFinalNote();
        this.secondJumpNote = this.getSecondJumpLength() + this.getSecondJumpStyle();
        this.totalNote = this.getFirstJumpNote() + this.getSecondJumpNote();
    }

    public double getTotalLength() {
        return totalLength;
    }

    public double getFirstJumpStyle() {
        return firstJumpStyle;
    }

    public double getSecondJumpStyle() {
        return secondJumpStyle;
    }

    public double getFirstJumpNote() {
        return firstJumpNote;
    }

    public double getSecondJumpNote() {
        return secondJumpNote;
    }

    public double getTotalNote() {
        return totalNote;
    }

}
