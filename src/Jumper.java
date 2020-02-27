
/**
 * @author bartlomiej.bak
 */
public class Jumper {
    static int jumpers;

    private int startingNo;
    private int height;
    private int weight;
    private double record = 0;
    private double firstRound, secondRound, totalNote;
    private Jump first, second;
    //todo taking care of jumper skills
    private int takeOffSkill, flightSkill, landingSkill;

    /**
     * Creates new jumper with variable height (160-200 cm) and weight (60-80 kg) and random lvl of skills
     */
    public Jumper() {
        jumpers++;
        this.startingNo = jumpers;
        this.height = (int)(200-Math.random()*40);
        this.weight = (int)(80-Math.random()*20);
    }

    /**
     * Jump on the hill
     * @param hill Hill
     * @return Jump
     */
    public Jump jump(Hill hill){
        Jump jump = new Jump(this, hill);
        return jump;
    }

    public double getFirstRound() {
        return firstRound;
    }

    public void setFirstRound(double firstRound) {
        this.firstRound = firstRound;
    }

    public double getSecondRound() {
        return secondRound;
    }

    public void setSecondRound(double secondRound) {
        this.secondRound = secondRound;
    }

    public double getTotalNote() {
        return totalNote;
    }

    public void setTotalNote(double totalNote) {
        this.totalNote = totalNote;
    }

    public Jump getFirst() {
        return first;
    }

    public void setFirst(Jump first) {
        this.first = first;
    }

    public Jump getSecond() {
        return second;
    }

    public void setSecond(Jump second) {
        this.second = second;
    }

    public double getRecord() {
        return record;
    }

    public void setRecord(double record) {
        this.record = record;
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

}
